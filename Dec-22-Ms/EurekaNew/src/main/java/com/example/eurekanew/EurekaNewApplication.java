package com.example.eurekanew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaNewApplication.class, args);
    }

}
