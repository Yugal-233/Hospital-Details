package com.springboot.ms.admissionservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.ms.admissionservice.models.DiseaseList;
import com.springboot.ms.admissionservice.models.EmployeesList;
import com.springboot.ms.admissionservice.models.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {
	

	@Autowired
	private RestTemplate restTemplate;
	
	List<Patient> patients = Arrays.asList(new Patient(1, "Yugal", "Indian"),new Patient(2, "Mayur", "Indian"));

	@RequestMapping("/physicians")
	public EmployeesList getPhysicians() {
		EmployeesList employeesList =restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
		return employeesList;
	}
	
	@RequestMapping("/diseases")
	public DiseaseList getdiseases(){
		DiseaseList diseaseList =restTemplate.getForObject("http://pathalogy-service/pathology/diseases", DiseaseList.class);
		return diseaseList;
	}
	
	
	@RequestMapping("/patients")
	public List<Patient> getPatients(){
		
		System.out.println("patients"+patients);
		return patients;
	}
	
	@RequestMapping("/patients/{Id}")
	public Patient getPatientById(@PathVariable("Id") Integer Id) {
		
		Patient p1 =  patients.stream().filter(patient ->Id.equals(patient.getId())).findAny().orElse(null);
		System.out.println("The value of p1 :: "+p1);
		return p1;
	}

}
