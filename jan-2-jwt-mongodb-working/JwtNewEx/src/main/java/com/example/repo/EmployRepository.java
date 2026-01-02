package com.example.repo;

import java.util.Optional;

import com.example.model.Employ;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface EmployRepository  extends MongoRepository<Employ,String> {
	Optional<Employ> findByName(String username);
}
