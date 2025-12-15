package com.example.consumer;

import com.example.model.Employ;
import com.example.repo.EmployRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private EmployRepository employRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "employ-topic-new", groupId = "employ-group")
    public void consume(String message) throws JsonProcessingException {
        Employ employ = objectMapper.readValue(message, Employ.class);
        employRepository.save(employ);
        System.out.println("Employ Record Saved in MongoDb...." +employ);
    }
}
