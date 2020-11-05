package com.sh.wx.web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sh.core.config.WxMaConfiguration;
import com.sh.core.type.UserTypeEnum;
import com.sh.core.util.IpUtil;
import com.sh.core.util.ResponseUtil;
import com.sh.db.domain.ShUser;
import com.sh.db.service.ShUserService;
import com.sh.wx.annotation.LoginUser;
import com.sh.wx.dto.UserInfo;
import com.sh.wx.dto.WxLoginInfo;
import com.sh.wx.service.UserTokenManager;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;

@RestController
@RequestMapping("/wx/auth")
@Validated
public class WxAuthController {
	
	private final Log logger = LogFactory.getLog(WxAuthController.class);
	
	@Autowired
	private ShUserService userService;

	@PostMapping("login_by_weixin")
	public Object loginByWeixin(@RequestBody WxLoginInfo wxLoginInfo, HttpServletRequest request) {
		String code = wxLoginInfo.getCode();
		String appid = wxLoginInfo.getAppid();
		UserInfo userInfo = wxLoginInfo.getUserInfo();
		if(code == null || userInfo == null) {
			return ResponseUtil.badArgument();
		}
		
		final WxMaService wxService = WxMaConfiguration.getMaService(appid);
		
		Integer shareUserId = wxLoginInfo.getShareUserId();
		String sessionKey = null;
		String openId = null;
		try {
			WxMaJscode2SessionResult result = wxService.getUserService().getSessionInfo(code);
			sessionKey = result.getSessionKey();
			openId = result.getOpenid();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(sessionKey == null || openId == null) {
			return ResponseUtil.fail();
		}
		
		ShUser user = userService.findByOpenId(openId);
		if(user == null) {
			user = new ShUser();
			user.setUsername(openId);
			user.setPassword(openId);
			user.setWeixinOpenid(openId);
			user.setAvatar(userInfo.getAvatarUrl());
			user.setNickname(userInfo.getNickName());
			user.setGender(userInfo.getGender());
			user.setUserLevel((byte) 0);
			user.setStatus((byte) 0);
			user.setLastLoginTime(LocalDateTime.now());
			user.setLastLoginIp(IpUtil.getIpAddr(request));
			user.setShareUserId(shareUserId);
			user.setSessionKey(sessionKey);
			
			userService.add(user);
		}else {
			user.setLastLoginTime(LocalDateTime.now());
            user.setLastLoginIp(IpUtil.getIpAddr(request));
            user.setSessionKey(sessionKey);
            if (userService.updateById(user) == 0) {
                return ResponseUtil.updatedDataFailed();
            }
		}
		
		String token = UserTokenManager.generateToken(user.getId());
		
		Map<Object, Object> result = new HashMap<Object, Object>();
		result.put("token", token);
        
        try {
        	String registerDate = DateTimeFormatter.ofPattern("yyyy-MM-dd")
					.format(user.getAddTime() != null ? user.getAddTime() : LocalDateTime.now());
			userInfo.setRegisterDate(registerDate);
			userInfo.setStatus(user.getStatus());
			userInfo.setUserLevel(user.getUserLevel());// 用户层级
			userInfo.setUserLevelDesc(UserTypeEnum.getInstance(user.getUserLevel()).getDesc());// 用户层级描述
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
        result.put("userInfo", userInfo);
		return ResponseUtil.ok(result);
	}
	
    @PostMapping("logout")
    public Object logout(@LoginUser Integer userId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        return ResponseUtil.ok();
    }
	
}
