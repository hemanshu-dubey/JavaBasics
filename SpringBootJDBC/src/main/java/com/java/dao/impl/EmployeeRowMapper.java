package com.java.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpFName(rs.getString("FirstName"));
		emp.setEmpId(rs.getInt("EmployeeID"));
		emp.setEmpLName(rs.getString("LastName"));
		emp.setEmpMail(rs.getString("Notes"));
		emp.setEmpSalary(rs.getDouble("Salary"));
		
		return emp;
	}  

}
