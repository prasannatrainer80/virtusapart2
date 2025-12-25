package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/")
    public String hello() {
        return "Hello me..";
    }
    @PostMapping(value="/addUser")
    public ResponseEntity<String>  addUser(@Valid @RequestBody User user){
            userService.addUser(user);
            return new ResponseEntity<>("User Added Successfully", HttpStatus.OK);
    }
}
