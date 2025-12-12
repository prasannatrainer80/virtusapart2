package com.example.webclientex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private ExternalService  externalService;

    @GetMapping(value="/showEmploy")
    public Mono<List<Employ>> showEmploy(){
        return externalService.showEmploy();
    }

    @GetMapping(value="/showUsers")
    public Mono<List<Users>> showUsers(){
        return externalService.getUsers();
    }

    @GetMapping(value="/searchEmploy/{empno}")
    public Mono<Employ> searchEmploy(@PathVariable("empno") Integer empno){
        return externalService.searchEmploy(empno);
    }
}
