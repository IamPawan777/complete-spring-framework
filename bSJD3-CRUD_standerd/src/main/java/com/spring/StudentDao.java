package com.spring;

import java.util.List;

import com.spring.Entities.Student;

public interface StudentDao {
	public int insert(Student student);

	public int change(Student student);

	public int delete(Student student);

	public Student getStd(int student);

	public List<Student> getAllStd();
}
