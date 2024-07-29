package com.aec.training.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aec.training.entity.Employee;
import com.aec.training.model.EmployeeDTO;
import com.aec.training.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepository employeeRepository;
	//@Autowired
	//Employees employees
	
	public void storeEmployee(EmployeeDTO emp) {
		Employee employees = new Employee();
		employees.setEmpId(emp.getEmpId());
		employees.setEmpname(emp.getEmpname());
		employees.setEmpemail(emp.getEmpemail());
		employees.setEmpephone(emp.getEmpephone());
		
		employeeRepository.save(employees);
	}
	

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	
	public void deleteEmployee(int id){
			Employee employee = employeeRepository.findById(id).get();
			employeeRepository.delete(employee);
	}
	
	
	
	public Employee updateEmployee(EmployeeDTO emp, Integer id) {
		Employee employee = employeeRepository.findById(id).get();
		System.out.println(" Employee "+ employee);
		
		employee.setEmpname(emp.getEmpname());
		employee.setEmpemail(emp.getEmpemail());
		employee.setEmpephone(emp.getEmpephone());
		employee.setEmpeaddress(emp.getEmpeaddress());
		
		Employee updatedEmployee = employeeRepository.save(employee);	
		System.out.println("End of the method updateEmployee()");
		
		return updatedEmployee;
	}
	
	public Employee findEmployeeByEmpId(String empId){
		 return  employeeRepository.findByEmpId(empId);
		}
	
	public List<Employee> findEmployeeByCity(String empCity){
		 return employeeRepository.findByEmpcity(empCity);
	    }
	}
	

