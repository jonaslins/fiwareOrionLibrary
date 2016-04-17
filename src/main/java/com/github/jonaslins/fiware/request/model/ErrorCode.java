package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

public class ErrorCode {

    @SerializedName("code")
    private String code;

    @SerializedName("reasonPhrase")
    private String reasonPhrase;



}