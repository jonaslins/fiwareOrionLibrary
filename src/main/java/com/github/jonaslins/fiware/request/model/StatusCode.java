package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

public class StatusCode {

    @SerializedName("code")
    private String code;

    @SerializedName("reasonPhrase")
    private String reasonPhrase;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public void setReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }
}