package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Vendor")

public class Vendor {
	
	@Id
	private int venId;
	private String venName;
	private String venPhnNo;
	private String venUsername;
	private String venPassword;
	private String venEmail;

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenPhnNo() {
		return venPhnNo;
	}

	public void setVenPhnNo(String venPhnNo) {
		this.venPhnNo = venPhnNo;
	}

	public String getVenUsername() {
		return venUsername;
	}

	public void setVenUsername(String venUsername) {
		this.venUsername = venUsername;
	}

	public String getVenPassword() {
		return venPassword;
	}

	public void setVenPassword(String venPassword) {
		this.venPassword = venPassword;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}
}
