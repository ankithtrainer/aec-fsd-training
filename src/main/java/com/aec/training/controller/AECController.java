package com.aec.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aec.training.model.EmployeeDTO;
import com.aec.training.service.EmployeeServices;

import jakarta.persistence.Entity;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AECController {	

	@Autowired
	EmployeeServices employeeServices;
	
	@Autowired
	EmployeeDTO employeeDTO;
	
	
	@RequestMapping("/")
	public String getController() {
		 System.out.println( " Welcome to Spring Boot MVC ....");
		
		return "employee-insert.jsp";
	}
	

	@RequestMapping(value = "/insert-emp-data" , method=RequestMethod.POST)
	public String insertEmployeeData(HttpServletRequest request) {
				
		String empId = request.getParameter("empid");
		String empname = request.getParameter("empname");
		String empemail = request.getParameter("empemail");
		String empcity = request.getParameter("empcity");
		String empephone = request.getParameter("empephone");
		String empeaddress = request.getParameter("empeaddress");
		
		System.out.println( " Emp Id :  "+ empId);
		System.out.println( " Emp Name:  "+ empname);
		System.out.println( " Emp Email :  "+ empemail);
		System.out.println( " Emp  empcity :  "+ empcity);
		System.out.println( " Emp Phone :  "+ empephone);
		System.out.println( " Emp Address :  "+ empeaddress);
        //Employee employee = new Employee();
		employeeDTO.setEmpId(empId);
		employeeDTO.setEmpname(empname);
		employeeDTO.setEmpephone(empephone);
		employeeDTO.setEmpemail(empemail);
		employeeDTO.setEmpeaddress(empeaddress);
		
		employeeServices.storeEmployee(employeeDTO);
		List<EmployeeDTO> listOfEmployee  = null;
		
		//List<Employee> listOfEmployee = employeeServices.getAllEmployee();
		
	
		
		request.setAttribute("employeeList", listOfEmployee);
		
		
		return "employee-insert.jsp";
	}
	
	
	
	
	

}
