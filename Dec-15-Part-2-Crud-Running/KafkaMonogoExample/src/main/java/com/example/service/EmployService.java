package com.example.service;

import com.example.model.Employ;
import com.example.producer.KafkaProducerService;
import com.example.repo.EmployRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    private EmployRepository employRepository;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    public List<Employ> showAllEmploy() throws JsonProcessingException {
        kafkaProducerService.publishMessage("SHOWALL", "Showing All Employ Records");
        return employRepository.findAll();
    }

    public void deleteEmploy(int empno) throws JsonProcessingException {

        Employ employFound = searchByEmpno(empno);
        employRepository.delete(employFound);
        kafkaProducerService.publishMessage("DELETE", "Delete Employ Record...");
    }

    public Employ updateEmploy(Employ employ) throws JsonProcessingException {
        Employ employFound = searchByEmpno(employ.getEmpno());
        if (employFound != null) {
            employFound.setName(employ.getName());
            employFound.setGender(employ.getGender());
            employFound.setDept(employ.getDept());
            employFound.setDesig(employ.getDesig());
            employFound.setBasic(employ.getBasic());
            employRepository.save(employFound);
            kafkaProducerService.publishEvent("UPDATE", employFound);
            return employFound;
        }
        kafkaProducerService.publishMessage("UPDATE", "Update Employ Record...");
        return null;
    }
    public Employ searchByEmpno(int empno) throws JsonProcessingException {
        kafkaProducerService.publishMessage("SEARCH", "Search By Employ No is Getting Fired...");
        return employRepository.findByEmpno(empno);
    }

    public Employ addEmploy(Employ employ) throws JsonProcessingException {
        Employ empRes =  employRepository.save(employ);
        kafkaProducerService.publishEvent("CREATE",empRes);
        return empRes;
    }
}
