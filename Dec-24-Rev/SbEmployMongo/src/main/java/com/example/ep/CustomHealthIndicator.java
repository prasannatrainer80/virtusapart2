package com.example.ep;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean status = CheckEmployServiceStatus.checkEmployServiceStatus();
        if (status) {
            return Health.up().withDetail("EmployService","Its Up and Available").build();
        } else {
            return Health.down().withDetail("EmployService","Not Available").build();
        }

    }
}
