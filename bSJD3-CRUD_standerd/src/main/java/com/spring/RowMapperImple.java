package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.Entities.Student;

public class RowMapperImple implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setS_id(rs.getInt(1));
		st.setS_name(rs.getString(2));
		st.sets_course(rs.getString(3));
		return st;
	}

}
