package com.springjdbc.javaFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		JdbcTemplate jd = context.getBean("cbdj", JdbcTemplate.class);
//		System.out.println(jd.getDataSource());
		
		String query = "insert into student values(?, ?, ?)";
		int i = jd.update(query, 88, "nain", "CSS");
		System.out.println("Successfully inserted");
		
		
	}
}
