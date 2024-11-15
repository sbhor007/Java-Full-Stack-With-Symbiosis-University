package com.trg;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session mySession = sf.openSession();
		Transaction myTransaction = mySession.beginTransaction();
		Employee e1 = new Employee();
		e1.setName("Ram");
		PermonontEmployee e2 = new PermonontEmployee();
		e2.setName("Sham");
		e2.setSalary(50000);
		e2.setBonus(5212);
		TempEmployee e3 = new TempEmployee();
		e3.setName("Santosh");
		e3.setPay(20000);
		e3.setDuration("5");
		
		mySession.persist(e1);
		mySession.persist(e2);
		mySession.persist(e3);
		
		myTransaction.commit();
		System.out.println("Successfully inserted");
		mySession.close();
		
	}

}
