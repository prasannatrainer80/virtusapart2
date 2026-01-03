package com.example.repo;

import com.example.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	Customer findByCusUsername(String cusUsername);
	Customer findByCusUsernameAndCusPassword(String cusUsername, String cusPassword);
}
