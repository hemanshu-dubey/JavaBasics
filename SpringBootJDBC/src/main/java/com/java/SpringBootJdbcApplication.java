package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.dao.EmployeeDAO;
import com.java.model.Employee;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDAO empDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		createEmployee();
        getEmployeeById();
		empDao.updateEmployee(21, "hemanshu.dubey@outlook.com");
		empDao.deleteEmployee(21);

	}

	private void getEmployeeById() {
		
		System.out.println(empDao.getEmployee(2));
		
	}

	private void createEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(21);
		emp.setEmpFName("Nitin");
		emp.setEmpLName("Dubey");
		emp.setEmpSalary(100000.00);
		emp.setEmpMail("dubey.hemanshu@gmail.com");
		
		empDao.createEmployee(emp);
		
	}
}
