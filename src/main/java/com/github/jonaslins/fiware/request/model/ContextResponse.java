package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

public class ContextResponse {

    @SerializedName("contextElement")
    private ContextElement contextElement;

    @SerializedName("statusCode")
    private StatusCode statusCode;

}