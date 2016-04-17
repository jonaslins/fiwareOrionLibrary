package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ContextElement {

    @SerializedName("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();

    @SerializedName("id")
    private String id;

    @SerializedName("isPattern")
    private Boolean isPattern;

    @SerializedName("type")
    private String type;

    public ContextElement(String type, String id, Boolean isPattern) {
        this.type = type;
        this.id = id;
        this.isPattern = isPattern;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPattern() {
        return isPattern;
    }

    public void setIsPattern(Boolean isPattern) {
        this.isPattern = isPattern;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addAttribute(Attribute attribute){
        attributes.add(attribute);
    }
}