package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class ExternalController {

    @Autowired
    private ExternalApiService externalApiService;

    @GetMapping("/employees")
    public Mono<List<String>> getEmployees() {
        return externalApiService.fetchEmployeesReactive();
    }
    @GetMapping("/dbemploys")
    public Mono<List<Employ>> getDbEmps() {
        return externalApiService.showEmployReactive();
    }
}
