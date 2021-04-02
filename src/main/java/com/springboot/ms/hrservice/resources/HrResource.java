package com.springboot.ms.hrservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ms.hrservice.model.Employee;
import com.springboot.ms.hrservice.model.EmployeesList;

@RestController
@RequestMapping("/hr")
public class HrResource {
	
	List<Employee> employee =  Arrays.asList(new Employee(10, "Saara", "Chaudhari", "MCA"),
			new Employee(20, "Yugal", "Chaudhari", "Software Engineer"),
			new Employee(30, "Mayur", "Chaudhari", "Production Engneer"),
			new Employee(40, "Laxman", "Mogale", "Dentist"));
	
	
	@RequestMapping("/employees")
	public EmployeesList getEmployees(){
		EmployeesList employeesList =new EmployeesList();
		employeesList.setEmployees(employee);
		
		return employeesList;
	}
	@RequestMapping("/employees/{Id}")
	public Employee getEmployeeById(@PathVariable("Id") Integer Id) {
		
		Employee e = employee.stream().filter(emp->Id.equals(emp.getId())).findAny().orElse(null);
		System.out.println(e);
		
		return e;
	}

}
