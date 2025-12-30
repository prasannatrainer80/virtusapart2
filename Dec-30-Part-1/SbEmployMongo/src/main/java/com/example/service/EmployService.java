package com.example.service;

import com.example.model.Employ;
import com.example.repo.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    private EmployRepository repository;

    public List<Employ> showEmploy() {
        return repository.findAll();
    }

    public Employ searchEmploy(int empno) {
        return repository.findByEmpno(empno);
    }

    public String addEmploy(Employ employ) {
        repository.save(employ);
        return "Employ Record Inserted...";
    }

    public String deleteEmploy(int empno) {
        Employ employ = repository.findByEmpno(empno);
        repository.delete(employ);
        return "Employ Record Deleted...";
    }
}
