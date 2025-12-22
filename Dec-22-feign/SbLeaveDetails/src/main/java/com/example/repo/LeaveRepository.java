package com.example.repo;

import com.example.model.Leave;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LeaveRepository extends MongoRepository<Leave,String> {
    Leave findByLeaveid(String leaveid);
    List<Leave> findByEmpno(int empno);
    Leave findTopByOrderByLeaveidDesc();
}
