package com.example.service;

import com.example.model.Leave;
import com.example.repo.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class LeaveService {

    @Autowired
    private LeaveRepository leaveRepository;

    public int getMaxLeaveId() {
        Leave leave = leaveRepository.findTopByOrderByLeaveidDesc();
        return (leave != null) ? leave.getLeaveid() : 0;
    }

    public List<Leave> findByEmpno(int empno){
        return leaveRepository.findByEmpno(empno);
    }

    public Leave findByLeaveid(String leaveid){
        return leaveRepository.findByLeaveid(leaveid);
    }

    public String applyLeave(Leave leave){
        long ms =  leave.getLeaveEndDate().getTime() - leave.getLeaveStartDate().getTime();
        int days =(int)(ms / (1000*60*60*24));
        days++;
        int id = getMaxLeaveId();
        id++;
        leave.setLeaveid(id);
        leave.setNoOfDays(days);
        leaveRepository.save(leave);
        return "Leave Applied Successfully";
    }
}
