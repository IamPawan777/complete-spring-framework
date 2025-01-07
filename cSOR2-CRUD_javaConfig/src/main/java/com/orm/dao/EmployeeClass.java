package com.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entities.Employee;


public class EmployeeClass implements EmployeeInterface {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemp(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public int insertData(Employee emp) {
		int insert = (Integer)this.hibernateTemplate.save(emp);
		return insert;
	}

	@Override
	@Transactional
	public void updateData(Employee emp) {
		this.hibernateTemplate.update(emp);
	}

	@Override
	@Transactional
	public void deleteData(int id) {
		Employee emp =  this.hibernateTemplate.get(Employee.class, id);
		if(emp != null) {
			this.hibernateTemplate.delete(emp);
			System.out.println("delete successfully");
		}
		else
			System.out.println("Emplyee "+id +" not available  in the register.");
	}
	
	
	@Override
	public Employee getOneEmp(int id) {
		Employee emp = this.hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> list = this.hibernateTemplate.loadAll(Employee.class);
		return list;
	}
	
	 
}
