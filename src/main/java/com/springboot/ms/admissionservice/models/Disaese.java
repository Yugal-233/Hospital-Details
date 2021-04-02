package com.springboot.ms.admissionservice.models;

public class Disaese {
	
	private int id;
	private String description;
	private String treatment;
	
	
	public Disaese() {
		super();
	}
	public Disaese(int id, String description, String treatment) {
		super();
		this.id = id;
		this.description = description;
		this.treatment = treatment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	@Override
	public String toString() {
		return "Disaese [id=" + id + ", description=" + description + ", treatment=" + treatment + "]";
	}
	
	
}
