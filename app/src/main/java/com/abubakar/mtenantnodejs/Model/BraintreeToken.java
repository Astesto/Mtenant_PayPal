package com.abubakar.mtenantnodejs.Model;

public class BraintreeToken {
    private String clientToken;
    private boolean success;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public BraintreeToken() {
    }

}
