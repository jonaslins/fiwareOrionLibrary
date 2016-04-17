package com.github.jonaslins.fiware.request.model;

public enum UpdateAction {

    UPDATE("UPDATE"),
    APPEND("APPEND"),
    DELETE("DELETE");

    private final String action;

    private UpdateAction(final String action) {
        this.action = action;
    }

}