package com.trg.springCoreWithAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new AnnotationConfigApplicationContext("bean.xnl");
        System.out.println( "Hello World!" );
        System.out.println( "Bean Loaded!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(College.class);
        College college = context.getBean("collegeBean",College.class);
//        College college = (College) context.getBean("collegeBean");
        college.collegeName();
        
        System.out.println("-------------------------***-----------------------");
        
        
    }
}
