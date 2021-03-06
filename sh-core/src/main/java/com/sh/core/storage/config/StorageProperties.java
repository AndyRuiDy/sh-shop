package com.sh.core.storage.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "sh.storage")
@Data
public class StorageProperties {

    private String active;
    private Local local;
    private Aliyun aliyun;
    private Tencent tencent;
    private Qiniu qiniu;
    
    @Data
    public static class Local{
    	private String address;
        private String storagePath;
    }
    
    @Data
    public static class Aliyun{
    	private String endpoint;
        private String accessKeyId;
        private String accessKeySecret;
        private String bucketName;
    }
    
    @Data
    public static class Tencent{
    	private String secretId;
        private String secretKey;
        private String region;
        private String bucketName;
    }
    
    @Data
    public static class Qiniu{
    	private String endpoint;
        private String accessKey;
        private String secretKey;
        private String bucketName;
    }
}
