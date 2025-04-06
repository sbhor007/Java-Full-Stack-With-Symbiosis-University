package com.trg.SpringXmlApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trg.autowireXml.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireXML.xml");
        
        EmployeeService serviceByName = context.getBean("employeeServiceByName",EmployeeService.class);
        System.out.println("Autowiring byName : " + serviceByName.getEmployee().getEmpName());
        
        EmployeeService serviceByType = context.getBean("employeeServiceByType",EmployeeService.class);
        System.out.println("Autowiring byType" + serviceByType.getEmployee().getEmpName());

        EmployeeService serviceByConstructor = context.getBean("employeeServiceConstructor",EmployeeService.class);
        System.out.println("Autowiring byConstructor" + serviceByConstructor.getEmployee().getEmpName());
    }
}
