package com.ibm.AOPExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    	EmployeeDao ed=context.getBean(EmployeeDao.class);
    	ed.getEmployeeById(2);
//    	ed.deleteEmployee(4);
    }
}
