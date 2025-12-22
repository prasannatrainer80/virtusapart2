package com.example;

import com.example.model.Employ;
import com.example.model.Leave;
import com.example.model.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employRt")
public class EmployController {

    @Autowired
    private EmployService employService;

    @Autowired
    private LeaveService leaveService;

    @PostMapping(value="/applyLeave")
    public String applyLeave(@RequestBody Leave leave) {
        return leaveService.applyLeave(leave);
    }
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
