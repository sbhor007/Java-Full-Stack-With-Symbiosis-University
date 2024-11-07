package com.trg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setCustName("Santosh");
		c1.setDept("ABC");
		session.save(c1);		
		t.commit();
		System.out.println("successfully saved");
		t = session.beginTransaction();
		Customer c2 = new Customer();
		c2.setId(3);
		c2.setCustName("Santosh");
		c2.setDept("ABC");
		session.save(c2);		
		t.commit();
		System.out.println("successfully saved");
		t = session.beginTransaction();
		session.delete(c2);
		t.commit();
		System.out.println("Record delete");
	}

}
