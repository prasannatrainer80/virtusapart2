package com.example.repo;

import com.example.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
 	Vendor findByVenUsernameAndVenPassword(String venUserName, String venPassword);
 	Vendor findByVenUsername(String venUserName);
}
