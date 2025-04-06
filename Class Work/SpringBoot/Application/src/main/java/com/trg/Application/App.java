package com.trg.Application;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee = (Employee) ctx.getBean("employee");
        
        System.out.println("Employee Class : " + employee);
        ctx.registerShutdownHook();
        
        System.out.println("-----------------Constructor injection-------------------");
        Country countryBean = (Country) ctx.getBean("country");
        String name = countryBean.getName();
        System.out.println("Country Name : " + name);
        long noofstates = countryBean.getNoOfstates();
        System.out.println("Country population : " + noofstates);
        System.out.println("---------------------with subject class----------");
//        List<String> s = new ArrayList<String>();
//        s.add(")
        Subjects sub = (Subjects) ctx.getBean("subject");
        List s = sub.getSubjects();
        s.forEach(su -> {
        	System.out.println(su);
        });
    }
}
