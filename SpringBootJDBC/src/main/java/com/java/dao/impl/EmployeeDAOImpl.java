package com.java.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.dao.EmployeeDAO;
import com.java.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createEmployee(Employee emp) {
		String CREATE_EMPLOYEE_SQL = "insert into Employees (EmployeeID,FirstName,LastName,Salary,Notes )values (?,?,?,?,?) ";
		int update =jdbcTemplate.update(CREATE_EMPLOYEE_SQL, emp.getEmpId(), emp.getEmpFName(), emp.getEmpLName(),
				emp.getEmpSalary(), emp.getEmpMail());

		if(update==1) {
			System.out.println("1 Record inserted");
		}else {
			System.out.println("Nothing inserted ");
		}
		
	}

	@Override
	public Employee getEmployee(Integer empId) {
		String getEmployeeSql="select * from Employees where Employeeid=?"; 
		Employee emp = jdbcTemplate.queryForObject( getEmployeeSql, new EmployeeRowMapper(),empId);
		
		return emp;

	}

	@Override
	public void updateEmployee(Integer emp, String email) {
		String updateEmployeeSql="update Employees set Notes=? where employeeid=?"; 
		
		int update =jdbcTemplate.update(updateEmployeeSql,email,emp);
		if(update==1) {
			System.out.println("1 Record updated");
		}else {
			System.out.println("Nothing updated ");
		}

	}

	@Override
	public void deleteEmployee(Integer empId) {

		String delEmployeeSql="Delete from Employees where employeeid=?"; 
		
		int update =jdbcTemplate.update(delEmployeeSql,empId);
		if(update==1) {
			System.out.println("1 Record deleted");
		}else {
			System.out.println("Nothing deleted ");
		}

	

	}

}
