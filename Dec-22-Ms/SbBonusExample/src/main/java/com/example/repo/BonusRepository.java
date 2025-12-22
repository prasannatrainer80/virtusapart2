package com.example.repo;

import com.example.model.Bonus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BonusRepository extends MongoRepository<Bonus,String> {
    List<Bonus> findByEmpno(int empno);
}
