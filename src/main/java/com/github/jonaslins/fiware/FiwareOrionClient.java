package com.github.jonaslins.fiware;

import com.github.jonaslins.fiware.request.FiwareContextRequest;

/**
 * Created by Jonas on 4/8/2016.
 */
public class FiwareOrionClient {

    public static FiwareContextRequest serverAddress(String serverAddress) {
        return new FiwareContextRequest(serverAddress);
    }
}
