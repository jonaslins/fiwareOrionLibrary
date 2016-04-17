package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

public class ContextResponse {

    @SerializedName("contextElement")
    private ContextElement contextElement;

    @SerializedName("statusCode")
    private StatusCode statusCode;

    public ContextElement getContextElement() {
        return contextElement;
    }

    public void setContextElement(ContextElement contextElement) {
        this.contextElement = contextElement;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}