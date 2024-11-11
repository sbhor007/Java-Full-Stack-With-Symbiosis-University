package com.trg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Course c1 = new Course("two months","JAVA Full Stack");
		Student s1 = new Student("Santosh","Nashik",c1);
		
		session.save(s1);
		transaction.commit();
		System.out.println("Transaction Success");
		
		Student s = (Student)session.load(Student.class, 1);
		System.out.println(s);
		
		session.close();
		sessionFactory.close();
	}
}
