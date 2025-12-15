package com.example.producer;

import com.example.model.Employ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "employ-topic-new";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void sendEmploy(Employ employ) throws JsonProcessingException {
        String json = objectMapper.writeValueAsString(employ);
        kafkaTemplate.send(TOPIC, json);
    }
}
