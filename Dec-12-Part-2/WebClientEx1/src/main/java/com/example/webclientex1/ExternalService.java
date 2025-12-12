package com.example.webclientex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Service
public class ExternalService {

    @Autowired
    private WebClient webClient;

    public Mono<List<Users>> getUsers() {
        return webClient.get()
                .uri("https://jsonplaceholder.typicode.com/users")
                .retrieve()
                .bodyToFlux(Users.class)
                .collectList();
    }

    public Mono<Employ> searchEmploy(int empno) {
        return webClient.get()
                .uri("/employ/search/{empno}",empno)
                .retrieve()
                .bodyToMono(Employ.class);
//                .collectList();
    }
    public Mono<List<Employ>> showEmploy() {
        return webClient.get()
                .uri("/employ/showEmploy")
                .retrieve()
                .bodyToFlux(Employ.class)
                .collectList();
    }
}
