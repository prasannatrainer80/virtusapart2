package com.example.service;

import com.example.dto.Employ;
import com.example.model.Bonus;
import com.example.repo.BonusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BonusService {

    @Autowired
    private BonusRepository bonusRepository;

    private final RestTemplate restTemplate;

    public BonusService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String addBonus(Bonus bonus){
        int empno = bonus.getEmpno();
        String url = "http://localhost:9000/searchEmploy/{empno}";
        Employ employ = restTemplate.getForObject(url, Employ.class, empno);
        double bn = employ.getBasic() * 0.10;
        bonus.setBonus(bn);
        bonusRepository.save(bonus);
        return "Bonus Added Successfully...";
    }
}
