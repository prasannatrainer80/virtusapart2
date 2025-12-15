package com.example.producer;

import com.example.model.Employ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "employ-topic-new";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void publishMessage(String eventType,String result) throws JsonProcessingException {
        Map<String,Object> event = new HashMap<>();
        event.put("eventType", eventType);
        event.put("data", result);

        kafkaTemplate.send(TOPIC, objectMapper.writeValueAsString(event));
    }
    public void publishEvent(String eventType, Employ employ) throws JsonProcessingException {
        Map<String,Object> event = new HashMap<>();
        event.put("eventType", eventType);
        event.put("data", employ);

        kafkaTemplate.send(TOPIC, objectMapper.writeValueAsString(event));
    }
//    public void sendEmploy(Employ employ) throws JsonProcessingException {
//        String json = objectMapper.writeValueAsString(employ);
//        kafkaTemplate.send(TOPIC, json);
//    }
}
