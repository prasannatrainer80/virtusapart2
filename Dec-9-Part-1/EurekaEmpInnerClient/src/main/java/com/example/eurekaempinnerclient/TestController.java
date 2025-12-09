package com.example.eurekaempinnerclient;

import com.java.spr.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/employshow")
    public Employ[] getEmploys() {
        Employ[] employs = restTemplate.getForObject("http://EUREKAEMPLOYCLIENT/employ/showEmploy", Employ[].class);
        return employs;
    }

    @GetMapping("empsearch/{empno}")
    public Employ search(@PathVariable int empno) {
        return restTemplate.getForObject("http://EUREKAEMPLOYCLIENT/employ/search/"+empno, Employ.class);
    }

}
