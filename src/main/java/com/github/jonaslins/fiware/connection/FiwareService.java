package com.github.jonaslins.fiware.connection;


import com.github.jonaslins.fiware.request.model.QueryContext;
import com.github.jonaslins.fiware.request.model.UpdateContext;
import com.github.jonaslins.fiware.request.model.FiwareResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Jonas on 4/8/2016.
 */
public interface FiwareService {

    @POST("v1/queryContext")
    Call<FiwareResponse> queryContext(@Body QueryContext body);

    @POST("v1/updateContext")
    Call<FiwareResponse> updateContext(@Body UpdateContext body);
}
