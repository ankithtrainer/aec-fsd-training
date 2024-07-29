package com.aec.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aec.training.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
   
	Employee findByEmpId(String empId);
	
	List<Employee> findByEmpcity(String empCity);
	
	
}
