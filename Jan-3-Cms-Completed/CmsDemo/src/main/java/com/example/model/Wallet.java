package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Wallet")

public class Wallet {

	@Id
	private int walId;
	private int cusId;
	private double walAmount;
    @Enumerated(EnumType.STRING)  // Save as String (preferred)
	private WalSource walSource;

	public int getWalId() {
		return walId;
	}

	public void setWalId(int walId) {
		this.walId = walId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public double getWalAmount() {
		return walAmount;
	}

	public void setWalAmount(double walAmount) {
		this.walAmount = walAmount;
	}

	public WalSource getWalSource() {
		return walSource;
	}

	public void setWalSource(WalSource walSource) {
		this.walSource = walSource;
	}
}
