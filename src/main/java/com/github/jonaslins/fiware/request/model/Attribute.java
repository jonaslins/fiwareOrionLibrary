package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Attribute {

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    @SerializedName("value")
    private String value;

    @SerializedName("metadatas")
    private List<Metadata> metadatas = new ArrayList<Metadata>();

    public Attribute(String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
}