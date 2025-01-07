package com.orm.dao;

import java.util.List;

import com.orm.entity.Student;

public interface StudentDaoInterface {
	public int saveStd(Student std);
	
	public Student getStd(int id);
	
	public List<Student> getAllStd();
	
	public void updateStd(Student std);
	
	public void deleteStd(int id);
}
