package com.practice.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(App.class);
    	Employee emp = cxt.getBean(Employee.class);
//    	emp.work();    // callback
    	emp.getDepartment().work();
    	cxt.close();   // close object
    	
    	
// -------------> XML based configuration  <---------------------------------------------    	

//        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
//        
//        Vehicle vh = context.getBean("vehicle",Car.class);
//        vh.drive();
//        
////        Employee emp = context.getBean("employee",Employee.class);
////        System.out.println(emp.toString());
////        
////        Employee emp2 = context.getBean("employee2",Employee.class);
////        System.out.println(emp2.toString());
////        
//        //scope of the bean
//        Department dept = context.getBean("department",Department.class);
//        System.out.println(dept.toString());
//        
//        Department dept1 = context.getBean("department",Department.class);
//        System.out.println(dept1.toString());
//        
//        Employee emp3 = context.getBean("employee3",Employee.class);
//        System.out.println(emp3.toString());
//        
//        
//        ((AbstractApplicationContext) context).close();
//        
    }
}
