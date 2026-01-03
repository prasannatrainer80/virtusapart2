package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Menu")

public class Menu {

	@Id
	private int menId;
	private String menItem;
	private double menPrice;
	private int menCalories;
	private String menSpeciality;

	public int getMenId() {
		return menId;
	}

	public void setMenId(int menId) {
		this.menId = menId;
	}

	public String getMenItem() {
		return menItem;
	}

	public void setMenItem(String menItem) {
		this.menItem = menItem;
	}

	public double getMenPrice() {
		return menPrice;
	}

	public void setMenPrice(double menPrice) {
		this.menPrice = menPrice;
	}

	public int getMenCalories() {
		return menCalories;
	}

	public void setMenCalories(int menCalories) {
		this.menCalories = menCalories;
	}

	public String getMenSpeciality() {
		return menSpeciality;
	}

	public void setMenSpeciality(String menSpeciality) {
		this.menSpeciality = menSpeciality;
	}
}
