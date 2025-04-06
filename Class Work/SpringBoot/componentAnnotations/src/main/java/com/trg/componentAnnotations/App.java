package com.trg.componentAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Food food = (Food) ctx.getBean("food");
        Juice juice = (Juice) ctx.getBean("juice");
//        System.out.println(juice.getJuiceName());
        System.out.println(juice);
    }
}
