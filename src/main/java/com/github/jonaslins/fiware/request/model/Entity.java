package com.github.jonaslins.fiware.request.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jonas on 4/8/2016.
 */
public class Entity {

    @SerializedName("type")
    private String type;

    @SerializedName("id")
    private String id;

    @SerializedName("isPattern")
    private boolean isPattern;

    public Entity(String type, String id, boolean isPattern) {
        this.type = type;
        this.id = id;
        this.isPattern = isPattern;
    }
}
