package com.orm.dao;

import java.util.List;

import com.orm.entities.Employee;

public interface EmployeeInterface {
	public int insertData(Employee emp);
	
	public void updateData(Employee emp);
	
	public void deleteData(int id);
	
	public Employee getOneEmp(int id);
	
	public List<Employee> getAllEmp();
	
}
