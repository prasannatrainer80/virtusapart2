package com.example;

import com.example.model.Employ;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployService {

    private final RestTemplate restTemplate;

    public EmployService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Employ> showEmploy() {
        String url = "http://localhost:9000/showEmploy";
        List<Employ> employs = restTemplate.getForObject(url, List.class);
        return employs;
    }

    public Employ searchEmploy(int empno) {
        String url = "http://localhost:9000/searchEmploy/{empno}";
        return restTemplate.getForObject(url, Employ.class, empno);
    }

    public String addEmploy(Employ employ) {
        String url ="http://localhost:9000/addEmploy";
        return restTemplate.postForObject(url, employ, String.class);
    }
}
