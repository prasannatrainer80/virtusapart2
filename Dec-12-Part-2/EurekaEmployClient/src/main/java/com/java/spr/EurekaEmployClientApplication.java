package com.java.spr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import io.github.resilience4j.circuitbreaker.configure.CircuitBreakerConfiguration;



@SpringBootApplication

public class EurekaEmployClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaEmployClientApplication.class, args);
    }

}
