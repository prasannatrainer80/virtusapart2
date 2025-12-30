package com.example.ep;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component("customMongo")
public class CustomDbHealthIndicator implements HealthIndicator {

    private final MongoTemplate mongoTemplate;

    public CustomDbHealthIndicator(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Health health() {
        try {
            mongoTemplate.executeCommand("{ ping: 1 }");
            return Health.up().withDetail("mongo", "Connected").build();
        } catch (Exception e) {
            return Health.down(e).build();
        }
    }
}
