package com.aec.training.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aec.training.entity.Employee;
import com.aec.training.model.EmployeeDTO;
import com.aec.training.service.EmployeeServices;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class AECRestController {
	@Autowired
	EmployeeServices employeeServices;
	
	@Autowired
	EmployeeDTO employeeDTO;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		List<Employee> listOfEmployee = employeeServices.getAllEmployee();
		return listOfEmployee;
		
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeByEmpId(@PathVariable String empId){
		Employee emp = employeeServices.findEmployeeByEmpId(empId);
		return emp;
		
	}
	
	@GetMapping("/employee/{empCity}")
	public List<Employee> getEmployeeByEmpCity(@PathVariable String empCity){
		List<Employee> empList = employeeServices.findEmployeeByCity(empCity);
		return empList;
		
	}


	//Create Employee Record  
	@PostMapping("/storedata")
	public void createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		
	 employeeServices.storeEmployee(employeeDTO);
		
	}
	
	//delete employee rest api  
		@DeleteMapping("/employees/{id}")
		public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable int id){
			employeeServices.deleteEmployee(id);
			
			Map<String, Boolean> response = new HashMap<String, Boolean>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
			
		}
	
		
		// Update employee rest api	
		@PutMapping("/update-employee/{id}")
		public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDTO employeeDTO){
			Employee emp = employeeServices.updateEmployee(employeeDTO, id);
			return ResponseEntity.ok(emp);
		}
}
