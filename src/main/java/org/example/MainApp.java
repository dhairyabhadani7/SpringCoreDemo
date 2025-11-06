package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       EmployeeService emp1 = context.getBean(org.example.EmployeeService.class);
       EmployeeService emp2 = context.getBean(org.example.EmployeeService.class);
       EmployeeService emp = context.getBean(org.example.EmployeeService.class);

       emp.setEmployeeName("Dhairya Bhadani");
       emp.showDetails();

//        System.out.println("emp1 hash: " + emp1.hashCode());
//        System.out.println("emp2 hash: " + emp2.hashCode());



    }
}
