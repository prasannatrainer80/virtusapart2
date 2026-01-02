package com.example.repo;

import java.util.Optional;

import com.example.model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer> {
	Optional<Employ> findByName(String username);
}
