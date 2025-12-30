package com.example.controller;

import com.example.model.Login;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value="/showlogin")
    public List<Login> show() {
            return loginService.show();
    }
    @GetMapping(value="/login/{user}/{pwd}")
    public String login(@PathVariable String user, @PathVariable String pwd) {
        int result = loginService.check(user, pwd);
        System.out.println(result);
        String res ="";
        res+=result;
        return res;
    }
}
