package com.sh.wx.dto;

import lombok.Data;

@Data
public class UserInfo {
    private static final long serialVersionUID = -5813029516433359765L;

	private Integer userId;
	private String nickName;
	private String avatarUrl;
	private String country;
	private String province;
	private String city;
	private String language;
	private Byte gender;
	private String phone;
	private Byte userLevel;// 用户层级 0 普通用户，1 VIP用户，2 区域代理用户
	private String userLevelDesc;// 代理用户描述
	
	private Byte status;//状态
	private String registerDate;//注册日期
}
