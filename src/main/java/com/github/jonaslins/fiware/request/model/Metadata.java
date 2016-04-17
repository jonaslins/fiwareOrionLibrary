package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    @SerializedName("value")
    private String value;

}