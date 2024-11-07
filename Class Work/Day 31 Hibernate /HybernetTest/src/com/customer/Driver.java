package com.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer customer = new Customer();
		customer.setId(10);
		customer.setCustName("Harshals");
		customer.setDept("IT");
		customer.setCustName("santosh");
//		session.save(customer);
		session.update("custName", customer);
		t.commit();
		System.out.println("Record inserted");
	}

}
