package com.github.jonaslins.fiware.request;

import com.github.jonaslins.fiware.request.model.FiwareResponse;

public interface FiwareCallback {
    void onResponseSuccess(FiwareResponse fiwareResponse, String rawBody);
    void onResponseFailure(Throwable t);
}