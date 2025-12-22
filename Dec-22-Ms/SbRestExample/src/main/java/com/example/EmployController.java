package com.example;

import com.example.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employRt")
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/showEmploy")
    public List<Employ> showRestClient(){
        return employService.showEmploy();
    }

    @GetMapping(value="/searchEmploy/{empno}")
    public Employ searchEmploy(@PathVariable int empno){
        return employService.searchEmploy(empno);
    }

    @PostMapping(value="/addEmploy")
    public String addEmploy(@RequestBody Employ employ){
        return employService.addEmploy(employ);
    }
}
