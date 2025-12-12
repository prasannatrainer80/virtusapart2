package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SlowApiController {

    @GetMapping("/employ/showEmploy")
    public List<String> slowApi() throws InterruptedException {
        Thread.sleep(5000); // simulate delay
        return List.of("Anusri", "Karthik", "Shaili");
    }
}

