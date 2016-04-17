package com.github.jonaslins.fiware;

import com.github.jonaslins.fiware.request.model.Attribute;
import com.github.jonaslins.fiware.request.model.ContextElement;
import com.github.jonaslins.fiware.request.model.FiwareResponse;
import com.github.jonaslins.fiware.request.model.UpdateAction;
import com.github.jonaslins.fiware.request.model.UpdateContext;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Response;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FiwareOrionRequestTest {

    static String SERVER_ADDRESS = "http://YOUR_SERVER_ADDRESS:YOUR_PORT/";

    @Test
    private void createEntity() throws IOException {

        ContextElement contextElement = new ContextElement("Room", "Room1", false);
        contextElement.addAttribute(new Attribute("temperature", "float", "23"));
        contextElement.addAttribute(new Attribute("pressure", "integer", "720"));

        UpdateContext updateContext = new UpdateContext();
        updateContext.setUpdateAction(UpdateAction.APPEND);
        updateContext.addContextElement(contextElement);

        //sync Request
        Response<FiwareResponse> response = FiwareOrionClient.serverAddress(SERVER_ADDRESS)
                .updateContext(updateContext)
                .executeRequest();
        assertTrue(response.isSuccessful());

        FiwareResponse fiwareResponse = response.body();

        String statusCode = fiwareResponse.getContextResponses().get(0).getStatusCode().getCode();
        assertEquals(statusCode, "OK");
    }

}