package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Service
public class ExternalApiService {

    @Autowired
    private WebClient webClient;

    public Mono<List<Employ>> showEmployReactive() {
        return webClient.get()
                .uri("http://localhost:1113/employ/showEmploy")
                .retrieve()
                .bodyToFlux(Employ.class)
                .collectList()
                .timeout(Duration.ofSeconds(2)) // reactive timeout
                .onErrorResume(ex -> {
                    System.out.println("TIMEOUT TRIGGERED → " + ex);
                    return Mono.just(List.of(new Employ(0, "TimeOut Error Occurred","","","",0)));
                });
    }

    public Mono<List<String>> fetchEmployeesReactive() {
        return webClient.get()
                .uri("/employ/showEmploy")
                .retrieve()
                .bodyToFlux(String.class)
                .collectList()
                .timeout(Duration.ofSeconds(2)) // reactive timeout
                .onErrorResume(ex -> {
                    System.out.println("TIMEOUT TRIGGERED → " + ex);
                    return Mono.just(List.of("Server TimedOut Please Try Again..."));
                });
    }
}
