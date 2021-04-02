package com.springboot.ms.admissionservice.models;

public class Employee {
	private int Id;
	private String firstName;
	private String lasttName;
	private String speciality;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String lasttName, String speciality) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.speciality = speciality;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", speciality="
				+ speciality + "]";
	}
	
}
