package com.java.dao;

import com.java.model.Employee;

public interface EmployeeDAO {

	public abstract void createEmployee(Employee emp);

	public abstract Employee getEmployee(Integer empId);

	public abstract void updateEmployee(Integer emp, String email);

	public abstract void deleteEmployee(Integer empId);

}
