package com.sh.wx.dto;

import lombok.Data;

@Data
public class WxLoginInfo {
	
	private String appid;
	
	private String code;
	
    private UserInfo userInfo;
    
    private Integer shareUserId;
}
