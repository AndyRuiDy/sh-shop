package com.sh.wx.dao;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserToken {

	private Integer userId;
	
	private String token;
	
	private String sessionKey;
	
	private LocalDateTime expireTime;
	
	private LocalDateTime updateTime;
	
}
