package org.java.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employ")
public class EmployController {

    @Autowired
    private IEmployService service;

    @GetMapping("/showEmploy")
    public List<Employ> showEmploy()  {
        return service.showEmploy();
    }

    @PostMapping("/addEmploy")
    public String addEmploy(@RequestBody Employ employ) {
        return service.addEmploy(employ);
    }

    @GetMapping("/search/{empno}")
    public Employ searchEmploy(@PathVariable int empno) {
        return service.searchEmploy(empno);
    }
}
