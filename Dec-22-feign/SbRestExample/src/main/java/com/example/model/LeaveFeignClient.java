package com.example.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name="leave-service",
        url = "http://localhost:8080/"
)

public interface LeaveFeignClient {
    @PostMapping("/applyLeave")
    String applyLeave(@RequestBody Leave leave);
}
