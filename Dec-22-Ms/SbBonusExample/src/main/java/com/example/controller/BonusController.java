package com.example.controller;

import com.example.model.Bonus;
import com.example.service.BonusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BonusController {

    @Autowired
    private BonusService bonusService;

    @PostMapping(value="/addBonus")
    public String addBonus(@RequestBody Bonus bonus){
        return bonusService.addBonus(bonus);
    }
}
