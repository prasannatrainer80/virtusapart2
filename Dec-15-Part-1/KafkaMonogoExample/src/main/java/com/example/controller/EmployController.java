package com.example.controller;

import com.example.model.Employ;
import com.example.producer.KafkaProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employ")
public class EmployController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping(value="/addEmploy")
    public String addEmploy(@RequestBody Employ employ) throws JsonProcessingException {
        kafkaProducerService.sendEmploy(employ);
        return "Employ Record Added and Sent to Kafka...";
    }
}
