package com.orm.configu;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.orm.dao.EmployeeClass;

@Configuration
@EnableTransactionManagement
public class javaconfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/springorm");
		ds.setUsername("root");
		ds.setPassword("IamPawan");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		
		Properties pro = new Properties();
		pro.put("hibernate,dialect", "org.hibernate.dialect.MySQL8Dialect");
		pro.put("hibernate.hbm2ddl.auto", "update");
		pro.put("hibernate.show_sql", "true");
		pro.put("hibernate.format_sql", "true");
		factory.setHibernateProperties(pro);
		
		factory.setPackagesToScan("com.orm.entities");
		return factory;
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate() {
		return new HibernateTemplate(getFactory().getObject());
	}
	
	@Bean("emp")
	public EmployeeClass empDao() {
		EmployeeClass emp = new EmployeeClass();
		emp.setHibernateTemp(getHibernateTemplate());
		return emp;
	}
	
	@Bean
	public HibernateTransactionManager getTransaction() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getFactory().getObject());
		return transactionManager;
	}
	
}
