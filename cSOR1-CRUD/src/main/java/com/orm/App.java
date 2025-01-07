package com.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.dao.StudentDao;
import com.orm.dao.StudentDaoInterface;
import com.orm.entity.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
        StudentDaoInterface std = con.getBean("stdDao", StudentDaoInterface.class);
      
        // insert...........
//        Student s = new Student(33, "Joker", "Mohak");
//        int insert = std.saveStd(s);
//        System.out.println("Successfully  "+insert);

        
        // get by id...........
        Student st = std.getStd(33);
        System.out.println(st);
        
        
//         get all...........
//        List<Student> list = std.getAllStd();
//        for(Student x : list) {
//        	System.out.println(x);
//        }
        
        
        // update........
//        Student s = new Student(33, "Joker", "Delhi");
//        std.updateStd(s);
//        System.out.println("Updated......");
        
        
//        //delete.............
//        std.deleteStd(11);
//        System.out.println("delete successfully");
        
    }
}
