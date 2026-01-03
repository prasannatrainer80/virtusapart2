package com.example.repo;

import java.util.List;

import com.example.model.WalSource;
import com.example.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {
	List<Wallet> findByCusId(int cusId);
	Wallet findByCusIdAndWalSource(int cusId, WalSource walSource);

}
