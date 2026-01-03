package com.example.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Orders")

public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ordId;
	private int cusId;
	private int venId;
	private String walSource;
	private int menId;
	private Date ordDate;
	private int ordQuantity;
	private double ordBillamount;
	@Enumerated(EnumType.STRING)  // Save as String (preferred)
	private OrderStatus ordStatus;
	private String ordComments;

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getWalSource() {
		return walSource;
	}

	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}

	public int getMenId() {
		return menId;
	}

	public void setMenId(int menId) {
		this.menId = menId;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public int getOrdQuantity() {
		return ordQuantity;
	}

	public void setOrdQuantity(int ordQuantity) {
		this.ordQuantity = ordQuantity;
	}

	public double getOrdBillamount() {
		return ordBillamount;
	}

	public void setOrdBillamount(double ordBillamount) {
		this.ordBillamount = ordBillamount;
	}

	public OrderStatus getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(OrderStatus ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getOrdComments() {
		return ordComments;
	}

	public void setOrdComments(String ordComments) {
		this.ordComments = ordComments;
	}
}
