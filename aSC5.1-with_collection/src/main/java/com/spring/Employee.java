package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int emp_id;
	private String emp_name;
	private List<String> emp_phone;
	private Set<Integer> emp_salary;
	private Map<String, String> emp_course;
	private Properties emp_pro;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public List<String> getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(List<String> emp_phone) {
		this.emp_phone = emp_phone;
	}
	public Set<Integer> getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(Set<Integer> emp_salary) {
		this.emp_salary = emp_salary;
	}
	public Map<String, String> getEmp_course() {
		return emp_course;
	}
	public void setEmp_course(Map<String, String> emp_course) {
		this.emp_course = emp_course;
	}
	public Properties getEmp_pro() {
		return emp_pro;
	}
	public void setEmp_pro(Properties emp_pro) {
		this.emp_pro = emp_pro;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_phone=" + emp_phone + ", emp_salary="
				+ emp_salary + ", emp_course=" + emp_course + ", emp_pro=" + emp_pro + "]";
	}
	
	
	
	
	
}
