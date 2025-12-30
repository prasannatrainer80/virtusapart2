package com.example.controller;

import com.example.model.Employ;
import com.example.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // 🔥 FIX
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/showEmploy")
    public List<Employ> showEmploy(){
        return employService.showEmploy();
    }

    @GetMapping(value="/searchEmploy/{empno}")
    public Employ searchEmploy(@PathVariable int empno){
        return employService.searchEmploy(empno);
    }

    @DeleteMapping(value="/deleteEmploy/{empno}")
    public String deleteEmploy(@PathVariable int empno){
        return employService.deleteEmploy(empno);
    }

    @PostMapping(value="/addEmploy")
    public String addEmploy(@RequestBody Employ employ){
        return employService.addEmploy(employ);
    }
}
