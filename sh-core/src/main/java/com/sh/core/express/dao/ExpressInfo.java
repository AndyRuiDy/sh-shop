package com.sh.core.express.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ExpressInfo {
	
    @JsonProperty("LogisticCode")
    private String LogisticCode;
    
    @JsonProperty("ShipperCode")
    private String ShipperCode;
    
    @JsonProperty("Traces")
    private List<Traces> Traces;
    
    @JsonProperty("State")
    private String State;
    
    @JsonProperty("EBusinessID")
    private String EBusinessID;
    
    @JsonProperty("Success")
    private boolean Success;
    
    @JsonProperty("Reason")
    private String Reason;

    private String ShipperName;
}
