package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.Entities.Student;

public class App {
	public static void main(String[] args) {
//		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");					// xml file
		ApplicationContext con = new AnnotationConfigApplicationContext(javaConfig.class);			// java configuration
		StudentDao stdDao =  con.getBean("getStudentDao", StudentDao.class);
		
		Student student = new Student();
		
		// insert
//		student.setS_id(303);
//		student.setS_name("Salim");
//		student.sets_course("ML");
//		int insert = stdDao.insert(student);
//		System.out.println("added successfully"+insert);
		
		
		// update
//		student.setS_name("Pawan");
//		student.sets_course("springBoot");
//		student.setS_id(22);
//		int change = stdDao.change(student);
//		System.out.println("Update successfully");
		
		
		
		//delete
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter id: ");		
//		student.setS_id(scan.nextInt());
//		int delete = stdDao.delete(student);
//		System.out.println("Delete Successfully");
		
		
		
		// select by id
//		Student std = stdDao.getStd(77);
//		System.out.println(std);
		
		
		// select by all
		List<Student> std = stdDao.getAllStd();
		for(Student s : std) {
			System.out.println(s);
		}
		
		
		
		
		
		
//		JdbcTemplate jdbc = con.getBean("jdbcTemplete", JdbcTemplate.class);

//		// Insert data...........
//		String insertQuery = "Insert into student values (?,?,?)";
////        jdbc.update(insertQuery, 202, "Komal", "Hindi");
////        System.out.println("Inserted successfully");
//
//		// Update data...........
//		String updateQuery = "update student Set name=?, course=? where id=?";
////        jdbc.update(updateQuery, "Zebra", "R", 202);
////        System.out.println("Update successfully");
//
//		// Delete data...........
//		String deleteQuery = "delete from student where id=?";
////        jdbc.update(deleteQuery, 202);
////        System.out.println("delete successfully");
//
//		
//		
//		// Fetch data.........
//		String selectQuery1 = "SELECT * FROM student where id=?";
//		String selectQuery2 = "SELECT * FROM student";
//		
//		RowMapper rm = new RowMapper() {
//			@Override
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				String name = rs.getString(2);
//				return name;
//			}
//		};
////		// by id............
////		Object name = jdbc.queryForObject(selectQuery1, rm, 101);
//		// System.out.println(name);
//		
////		// complete column.......
//		List<String> list =  jdbc.query(selectQuery2, rm);
//		for(String name : list)
//			System.out.println(name);


	}


}
