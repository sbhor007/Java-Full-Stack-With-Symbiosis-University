package com.trg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Driver {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		//get session from session factory
		Session session = sf.openSession();
		//Being transaction
		Transaction t = session.beginTransaction();
		//Creating Employee base class record
		Employee employee = new Employee();
		employee.setId(6);
		employee.setFirstName("Santosh");
		employee.setLastName("Bhor");
		session.save(employee); // insert data 
		 //delete, update
		t.commit();
		System.out.println("successfully saved");
	}

}
