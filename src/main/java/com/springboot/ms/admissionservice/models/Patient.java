package com.springboot.ms.admissionservice.models;

public class Patient {

	private int Id;
	private String name;
	private String nationality;
	
	
	
	public Patient() {
	}
	public Patient(int id, String name, String nationality) {
		Id = id;
		this.name = name;
		this.nationality = nationality;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", name=" + name + ", nationality=" + nationality + "]";
	}
}
