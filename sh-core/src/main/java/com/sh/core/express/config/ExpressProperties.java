package com.sh.core.express.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "sh.express")
public class ExpressProperties {

    private boolean enable;
    private String appId;
    private String appKey;
    private List<Map<String, String>> vendors = new ArrayList<>();
    
    public boolean isEnable() {
        return enable;
    }

}
