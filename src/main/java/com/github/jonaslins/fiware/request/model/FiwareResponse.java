package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FiwareResponse {

    @SerializedName("contextResponses")
    private List<ContextResponse> contextResponses = new ArrayList<ContextResponse>();

    @SerializedName("errorCode")
    private ErrorCode errorCode;

}