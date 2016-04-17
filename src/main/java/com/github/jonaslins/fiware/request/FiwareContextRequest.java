package com.github.jonaslins.fiware.request;

import com.github.jonaslins.fiware.connection.FiwareConnection;
import com.github.jonaslins.fiware.connection.FiwareService;

import com.github.jonaslins.fiware.request.model.QueryContext;
import com.github.jonaslins.fiware.request.model.UpdateContext;
import com.github.jonaslins.fiware.request.model.FiwareResponse;
import retrofit2.Call;


/**
 * Created by Jonas on 4/8/2016.
 */
public class FiwareContextRequest {
    private String fiwareAddress;
    public FiwareContextRequest(String fiwareAddress) {
        this.fiwareAddress = fiwareAddress;
    }

    public FiwareRequest queryContext(QueryContext queryContext) {
        Call<FiwareResponse> responseCall = getFiwareService().queryContext(queryContext);
        return new FiwareRequest(responseCall);
    }

    public FiwareRequest updateContext(UpdateContext updateContext) {
        Call<FiwareResponse> responseCall = getFiwareService().updateContext(updateContext);
        return new FiwareRequest(responseCall);
    }


    private FiwareService getFiwareService(){
        return FiwareConnection.getInstance()
                .createService(fiwareAddress);
    }
}
