package com.trg.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext myContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        MyCalculator cal = (MyCalculator) myContext.getBean("simpleCalc");
        int result = cal.add(30, 50);
        System.out.println("Addition : " + result);
        int subResult = cal.sub(300, 50);
        System.out.println("Substarctions : " + subResult);
//        -----------------------Before Aspect----------------
        System.out.println("---------------Before Aspect------------");
        MyCalculator calOne = (MyCalculator) myContext.getBean("simpleCalcOne");
        int resultOne = calOne.add(30, 50);
 
        System.out.println("Addition : " + resultOne);
        int subResultOne = calOne.sub(300, 50);
        System.out.println("Substarctions : " + subResultOne);
    }
}
