package com.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entity.Student;

public class StudentDao implements StudentDaoInterface {
	
	private HibernateTemplate hibernateTemplate;
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// insert...
	@Transactional
	@Override
	public int saveStd(Student std) {
		return (Integer) this.hibernateTemplate.save(std);
	}

	// get one........
	@Override
	public Student getStd(int id) {
		Student st = this.hibernateTemplate.get(Student.class, id);
		return st;
	}

	// get all......
	@Override
	public List<Student> getAllStd() {
		List<Student> list = this.hibernateTemplate.loadAll(Student.class);
		return list;
	}

	// update..........
	@Transactional
	public void updateStd(Student std) {
		this.hibernateTemplate.update(std);
	}

	// delete.........
	@Transactional
	public void deleteStd(int id) {
		Student st = this.hibernateTemplate.get(Student.class, id);
		if(st != null)
			this.hibernateTemplate.delete(st);
	}

	
	


}
