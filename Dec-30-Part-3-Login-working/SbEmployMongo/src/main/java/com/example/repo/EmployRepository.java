package com.example.repo;

import com.example.model.Employ;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployRepository extends MongoRepository<Employ,String> {
    Employ findByEmpno(int empno);
}
