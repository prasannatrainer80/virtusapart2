package org.java.sb.circuitnewex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/")
    public String hello() {
        return "Hi";
    }

    @GetMapping(value="/showEmploy")
    public List<Employ> showEmploy() {
        return employService.showEmploy();
    }

    @GetMapping(value="/searchEmploy/{empno}")
    public Employ searchEmploy(@PathVariable Long empno) {
        return employService.showEmployById(empno);
    }

    @PostMapping(value="/addEmploy")
    public String addEmploy(@RequestBody Employ employ) {
        return employService.addEmploy(employ);
    }



    @PutMapping(value="/updateEmploy")
    public String updateEmploy(Employ employ) {
        return employService.updateEmploy(employ);
    }
}
