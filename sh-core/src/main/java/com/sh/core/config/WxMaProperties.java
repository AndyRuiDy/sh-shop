package com.sh.core.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "sh.wx")
public class WxMaProperties {

	private List<Config> configs;
	
	private String mchId;
	
	private String mchKey;
	
	private String notifyUrl;
	
	private String keyPath;
	
	@Data
    public static class Config {
        /**
         * 设置微信小程序的appid
         */
        private String appid;

        /**
         * 设置微信小程序的Secret
         */
        private String secret;

        /**
         * 设置微信小程序消息服务器配置的token
         */
        private String token;

        /**
         * 设置微信小程序消息服务器配置的EncodingAESKey
         */
        private String aesKey;

        /**
         * 消息格式，XML或者JSON
         */
        private String msgDataFormat;
    }
}
