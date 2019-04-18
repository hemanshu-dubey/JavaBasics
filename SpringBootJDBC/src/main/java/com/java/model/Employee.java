package com.java.model;

import com.java.dao.EmployeeDAO;

public class Employee {

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFName=" + empFName + ", empLName=" + empLName + ", empSalary="
				+ empSalary + ", empMail=" + empMail + "]";
	}

	private Integer empId;
	private String empFName;
	private String empLName;
	private Double empSalary;
	private String empMail;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpFName() {
		return empFName;
	}

	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	public String getEmpLName() {
		return empLName;
	}

	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

}
