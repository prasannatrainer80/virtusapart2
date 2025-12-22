package com.example.model;

import com.example.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveService {

    @Autowired
    private LeaveFeignClient leaveFeignClient;

    @Autowired
    private EmployService employService;

    public String applyLeave(Leave leave) {
        System.out.println(leave);
        System.out.println(leave.getEmpno());
        Employ employ = employService.searchEmploy(leave.getEmpno());
        if (employ != null) {
            return leaveFeignClient.applyLeave(leave);
        }
        return "Employ Number Not Found...";
    }
}
