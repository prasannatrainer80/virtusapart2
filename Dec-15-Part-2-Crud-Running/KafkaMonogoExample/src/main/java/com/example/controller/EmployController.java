package com.example.controller;

import com.example.model.Employ;
import com.example.producer.KafkaProducerService;
import com.example.service.EmployService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employ")
public class EmployController {

    @Autowired
    private EmployService employService;

    @PostMapping(value="/addEmploy")
    public Employ addEmploy(@RequestBody Employ employ) throws JsonProcessingException {
        return employService.addEmploy(employ);
    }

    @GetMapping(value="/showemploy")
    public List<Employ> showEmploy() throws JsonProcessingException {
        return employService.showAllEmploy();
    }

    @GetMapping(value="/search/{empno}")
    public Employ searchEmploy(@PathVariable int empno) throws JsonProcessingException {
        return employService.searchByEmpno(empno);
    }

    @DeleteMapping(value="/delete/{empno}")
    public String deleteEmploy(@PathVariable int empno) throws JsonProcessingException {
         employService.deleteEmploy(empno);
         return "Employ Record Deleted...";
    }

    @PutMapping(value="/updateEmploy")
    public Employ update(@RequestBody Employ employ) throws JsonProcessingException {
        return employService.updateEmploy(employ);
//        return "Employ Record Updated...";
    }

//    @Autowired
//    private KafkaProducerService kafkaProducerService;
//
//    @PostMapping(value="/addEmploy")
//    public String addEmploy(@RequestBody Employ employ) throws JsonProcessingException {
//        kafkaProducerService.sendEmploy(employ);
//        return "Employ Record Added and Sent to Kafka...";
//    }
}
