package com.springjdbc.xmlFile;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
    	JdbcTemplate jdbc =  app.getBean("jdbcTemplete", JdbcTemplate.class );
    	
    	String query = "insert into student values (?,?,?)";
    	int i = jdbc.update(query,  99,"queen","English");
    	System.out.println("successfully insert...."+i);
    }
}
