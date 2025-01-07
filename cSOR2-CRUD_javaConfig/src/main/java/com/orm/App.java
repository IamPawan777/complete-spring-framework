package com.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.orm.configu.javaconfig;
import com.orm.dao.EmployeeInterface;
import com.orm.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(javaconfig.class);
        EmployeeInterface bean = con.getBean("emp", EmployeeInterface.class);
//        System.out.println(bean);
        
//        Employee e = new Employee(15, "Pawan", "Softwar Engineer");
//        int insert = bean.insertData(e);
//        System.out.println(insert + "....Insert Successfully.");
        
        
        
//        Employee emp = bean.getOneEmp(13);
//        System.out.println(emp);
        
        
        
//        List<Employee> list = bean.getAllEmp();
//        for(Employee l : list)
//        	System.out.println(l);
        
         
        
//       Employee e = new Employee(12, "Radha", "FrontEnd");
//       bean.updateData(e);
//       System.out.println("updated..........");
        
        
        
        
      bean.deleteData(12);
      
        
        
        
    }
}
