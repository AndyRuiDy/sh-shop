package com.sh.core.notify;

import lombok.Data;

@Data
public class SmsResult {
	
	private boolean successful;
	
    private Object result;
    
    /**
     * 短信是否发送成功
     *
     * @return
     */
    public boolean isSuccessful() {
        return successful;
    }

}
