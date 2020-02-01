package com.spring.demo.entity;

public class AccociatedDrug {
	private String name;
	private String dose;
	private String strength;
	
	public AccociatedDrug() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public AccociatedDrug(String name, String dose, String strength) {
		super();
		this.name = name;
		this.dose = dose;
		this.strength = strength;
	}
	
	


}
