package com.vaibhav.hibernate.dao;

import java.util.List;

import com.vaibhav.hibernate.entity.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	 
    public List<Employee> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
}
