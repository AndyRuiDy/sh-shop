package com.sh.core.notify.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "sh.notify")
public class NotifyProperties {
	
    private Mail mail;
    
    private Sms sms;
    
    @Data
    public static class Mail {
        private boolean enable;
        private String host;
        private String username;
        private String password;
        private String sendfrom;
        private String sendto;
        private Integer port;
        
        public boolean isEnable() {
            return enable;
        }
    }

    @Data
    public static class Sms {
        private boolean enable;
        private String active;
        private String sign;
        private Tencent tencent;
        private Aliyun aliyun;
        private List<Map<String, String>> template = new ArrayList<>();

        public boolean isEnable() {
            return enable;
        }

        @Data
        public static class Tencent {
            private int appid;
            private String appkey;
        }

        @Data
        public static class Aliyun {
            private String regionId;
            private String accessKeyId;
            private String accessKeySecret;

        }
    }

}
