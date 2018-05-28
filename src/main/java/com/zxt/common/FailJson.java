package com.zxt.common;

public class FailJson {
    private String STATE="FAIL";
    private String reason;

    public String getSTATE() {
        return STATE;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
