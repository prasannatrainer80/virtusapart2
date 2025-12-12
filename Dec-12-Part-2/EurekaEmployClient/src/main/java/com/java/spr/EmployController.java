package com.java.spr;

import com.java.spr.model.Employ;
import com.java.spr.service.EmployService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employ")
public class EmployController {

    @Autowired
    private EmployService employService;

//    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackShowEmploy")
    @GetMapping("/showEmploy")
    public List<Employ> showEmploy() throws InterruptedException {
        Thread.sleep(6000);
      return employService.showEmploy();
    }

    public List<Employ> fallbackShowEmploy(Throwable ex) {
        System.out.println("Fallback triggered: " + ex.getMessage());
        return List.of();
    }


    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackAddEmploy")
    @PostMapping("/addEmploy")
    public String addEmploy(@RequestBody Employ employ) {
        return employService.addEmploy(employ);
    }

//    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackSearchEmploy")
    @GetMapping("/search/{empno}")
    public Employ searchEmploy(@PathVariable int empno) {
        return employService.searchEmploy(empno);
    }

    // --------- Fallbacks ---------

//    public List<Employ> fallbackShowEmploy(Throwable ex) {
//        System.out.println("Fallback Triggered for /showEmploy → " + ex.getMessage());
//        return List.of();
//    }

    public String fallbackAddEmploy(Employ employ, Throwable ex) {
        System.out.println("Fallback triggered for addEmploy: " + ex.getMessage());
        return "Service temporarily unavailable! Unable to add employ.";
    }

    public Employ fallbackSearchEmploy(int empno, Throwable ex) {
        System.out.println("Fallback triggered for searchEmploy: " + ex.getMessage());
        return null;
    }
}
