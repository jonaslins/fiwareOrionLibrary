package com.github.jonaslins.fiware.request;

import com.github.jonaslins.fiware.request.model.FiwareResponse;
import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jonas on 4/16/2016.
 */
public class FiwareRequest {

    private Call<FiwareResponse> responseCall;

    public FiwareRequest(Call<FiwareResponse> responseCall) {
        this.responseCall = responseCall;
    }

    public void asyncRequest(final FiwareCallback callback) {

        responseCall.enqueue(new Callback<FiwareResponse>() {
            @Override
            public void onResponse(Call<FiwareResponse> call, Response<FiwareResponse> response) {
                if (callback != null) {
                    callback.onResponseSuccess(response.body(), new Gson().toJson(response.body()));
                }
            }

            @Override
            public void onFailure(Call<FiwareResponse> call, Throwable t) {
                if (callback != null) {
                    callback.onResponseFailure(t);
                }
            }
        });

    }

    public Response<FiwareResponse> executeRequest() throws IOException {
        return responseCall.execute();
    }
}
