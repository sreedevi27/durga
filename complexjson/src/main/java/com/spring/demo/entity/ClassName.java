package com.spring.demo.entity;

import java.util.List;

public class ClassName {
	
	public List<AccociatedDrug> accociatedDrug;
	public ClassName() {
		
	}
	public List<AccociatedDrug> getAccociatedDrug() {
		return accociatedDrug;
	}
	public void setAccociatedDrug(List<AccociatedDrug> accociatedDrug) {
		this.accociatedDrug = accociatedDrug;
	}
	public ClassName(List<AccociatedDrug> accociatedDrug) {
		super();
		this.accociatedDrug = accociatedDrug;
	}
	

}
