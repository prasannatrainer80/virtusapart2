package com.example.controller;

import com.example.model.Leave;
import com.example.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @PostMapping(value="/applyLeave")
    public String applyLeave(@RequestBody Leave leave) {
        return leaveService.applyLeave(leave);
    }
}
