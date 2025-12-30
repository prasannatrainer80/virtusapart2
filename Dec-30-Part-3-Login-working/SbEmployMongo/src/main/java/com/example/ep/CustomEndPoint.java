package com.example.ep;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint (id = "customEndPoint")
public class CustomEndPoint {

    @ReadOperation
    public String customOperation() {
        return "Custom End Point Response...";
    }
}
