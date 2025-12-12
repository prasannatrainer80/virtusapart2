package org.java.sb;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployServiceImpl implements IEmployService {

    @Autowired
    private EmployRepository repo;

    @Override
    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackShowEmploy")
    public List<Employ> showEmploy() {

        // FORCE FAILURE --> Ensures fallback gets triggered
        if (true) {
            throw new RuntimeException("DB Down!");
        }

        return repo.findAll();
    }

    @Override
    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackAddEmploy")
    public String addEmploy(Employ e) {

        // Simulate slow or failure
        throw new RuntimeException("Insert Failure");

        // return repo.save(e);
    }

    @Override
    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackSearchEmploy")
    public Employ searchEmploy(int empno) {
        throw new RuntimeException("Search Failed");
//        return repo.findById(empno).orElse(null);
    }


    // --- FALLBACKS ---

    public List<Employ> fallbackShowEmploy(Throwable ex) {
        System.out.println("Fallback: showEmploy: " + ex.getMessage());
        return List.of();
    }

    public String fallbackAddEmploy(Employ e, Throwable ex) {
        System.out.println("Fallback: addEmploy: " + ex.getMessage());
        return "Service Down! Cannot add employ.";
    }

    public Employ fallbackSearchEmploy(int empno, Throwable ex) {
        System.out.println("Fallback: searchEmploy: " + ex.getMessage());
        return null;
    }
}
