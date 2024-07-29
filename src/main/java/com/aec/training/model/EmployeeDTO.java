package com.aec.training.model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDTO {
	
	private String empId;
	private String empname;
	private String empemail;
	private String empcity;
	private String empephone;
	private String empeaddress;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public String getEmpephone() {
		return empephone;
	}
	public void setEmpephone(String empephone) {
		this.empephone = empephone;
	}
	public String getEmpeaddress() {
		return empeaddress;
	}
	public void setEmpeaddress(String empeaddress) {
		this.empeaddress = empeaddress;
	}
	
}
