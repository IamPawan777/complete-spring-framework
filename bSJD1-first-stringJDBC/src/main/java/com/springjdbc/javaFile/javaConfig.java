package com.springjdbc.javaFile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class javaConfig {
	@Bean
	public DataSource getDatabaseCredential() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("IamPawan");
		return ds;
	}
	
	@Bean(name = {"jdbc", "cbdj"})
	public JdbcTemplate getJdbcTemplete() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDatabaseCredential());
		return jt;
	}
}
