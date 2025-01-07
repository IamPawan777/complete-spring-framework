package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.Entities.Student;

@Component("getStudentDao")
public class StudentDaoImple implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemp;

	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}

	@Override
	public int insert(Student std) {
		String insertQuery = "Insert into student values (?,?,?)";
		int i = this.jdbcTemp.update(insertQuery, std.getS_id(), std.getS_name(), std.gets_course());
		return i;
	}

	@Override
	public int change(Student std) {
		String updateQuery = "update student Set name=?, course=? where id=?";
		int u = this.jdbcTemp.update(updateQuery, std.getS_name(), std.gets_course(), std.getS_id());
		return u;
	}

	@Override
	public int delete(Student student) {
		String deleteQuery = "delete from student where id=?";
		int delete = this.jdbcTemp.update(deleteQuery, student.getS_id());
		return delete;
	}

	@Override
	public Student getStd(int sId) {
		String selectQuery = "Select * from student where id=?";
		RowMapper<Student> rowMa = new RowMapperImple();
		Student std = this.jdbcTemp.queryForObject(selectQuery, rowMa, sId);
		return std;
	}

	@Override
	public List<Student> getAllStd() {
		String selectQuery2 = "Select * from Student";
		List<Student> std = this.jdbcTemp.query(selectQuery2, new RowMapperImple());
		return std;
	}
	
	
}
