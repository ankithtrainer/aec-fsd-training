package com.aec.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private  Integer id;	
	@Column(name="employee_id")
	private  String empId;
	@Column(name="employee_name")
	private  String empname;
	@Column(name="employee_email")
	private  String empemail;
	

	@Column(name="employee_city")
	private  String empcity;
	

	@Column(name="employee_phone")
	private  String empephone;
	

	@Column(name="employee_address")
	private  String empeaddress;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


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
