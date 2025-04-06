package com.trg.hibernate_JAP;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        System.out.println("Starting transaction");
        entityManager.getTransaction().begin();
        Employee employee = new Employee();
        employee.setName("Santosh");
        entityManager.persist(employee);
        System.out.println("--------------------------------------------");
//        entityManager.flush();
//        entityManager.getTransaction().commit(); // the missing statement
        System.out.println("Saving Employee to database");
        
        System.out.println("Generated Employee Id : " + employee.getEmployeeId());
        //get an object using primary key
        System.out.println("--------------------------------------------");
        Employee emp = entityManager.find(Employee.class, employee.getEmployeeId());
        System.out.println("got Object " + emp.getName() + " " + emp.getEmployeeId());
        
        // get all the objects from Employee table
        
        @SuppressWarnings("unchecked")
        List<Employee> listEmployee = entityManager.createQuery("SELECT e FROM Employee e").getResultList();
        if(listEmployee == null) {
        	System.err.println("No employee found");
        }else {
        	listEmployee.forEach(e ->{
            	System.out.println("Employee Id : " + e.getEmployeeId());
            	System.out.println("Employee Name : " + e.getName());
            });
        }
        
        entityManager.flush();
        entityManager.getTransaction().commit();
        System.out.println("--------------------------------------------");
        //remove entity
        entityManager.getTransaction().begin();
        System.out.println("Deleting Employee with ID : " + emp.getEmployeeId());
        entityManager.remove(emp);
        entityManager.getTransaction().commit();
        System.out.println("--------------------------------------------");
        
        //update entity
        entityManager.getTransaction().begin();
        Employee e = entityManager.find(Employee.class, 15);
        e.setName("Durgesh");
        entityManager.merge(e);
        entityManager.getTransaction().commit();
        System.out.println("Updating Employee With ID : " + 15);
        
        //Close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
