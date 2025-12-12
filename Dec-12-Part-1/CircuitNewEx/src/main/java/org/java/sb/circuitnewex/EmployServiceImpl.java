package org.java.sb.circuitnewex;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployServiceImpl implements EmployService {

    @Autowired
    private EmployRepository repo;

    @Override
    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackShowEmploy")
    public List<Employ> showEmploy() {
        if (true) {
            throw new RuntimeException("Service is Down Please Wait for Sometime...!");
        }
       return repo.findAll();
    }

    // --- FALLBACKS ---

    public List<Employ> fallbackShowEmploy(Throwable ex) {
        System.out.println("Fallback: showEmploy: " + ex.getMessage());
        return List.of();
    }

    @Override
    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackSearchEmploy")
    public Employ showEmployById(Long id) {
        throw new RuntimeException("Search Operation not permitted Now...Wait");
//        return repo.findById(id).get();
    }

    public Employ fallbackSearchEmploy(Long empno, Throwable ex) {
        System.out.println("Fallback: searchEmploy: " + ex.getMessage());
        return null;
    }

    public String fallbackAddEmploy(Employ e, Throwable ex) {
        System.out.println("Fallback: addEmploy: " + ex.getMessage());
        return "Service Down! Cannot add employ.";
    }

    public String fallbackUpdateEmploy(Employ e, Throwable ex) {
        System.out.println("Fallback: updateEmploy: " + ex.getMessage());
        return "Service Down! Cannot Update employ.";
    }
    @Override
    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackAddEmploy")
    public String addEmploy(Employ employ) {
        // Simulate slow or failure
        throw new RuntimeException("Server Issue...Insert Blocked Please Wait");
//        repo.save(employ);
//        return "Employ Record Inserted...";
    }

    @Override
    @CircuitBreaker(name = "employCB", fallbackMethod = "fallbackUpdateEmploy")
    public String updateEmploy(Employ employ) {
        throw new RuntimeException("Server Issue...Update Blocked Please Wait");
//        repo.save(employ);
//        return "Employ Record Updated...";
    }
}
