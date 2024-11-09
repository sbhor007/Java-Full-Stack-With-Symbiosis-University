package com.trg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Driver {

	public static void main(String[] args) {
		SessionFactory myFactory = new Configuration().configure().buildSessionFactory();
		Session mySession = myFactory.openSession();
		Transaction myTransaction = mySession.beginTransaction();
		
		Student student = new Student();
		student.setId(101);
		student.setName("Santosh");
		student.setPassingYear("2025");
		
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Vinaya mam");
		teacher.setSubjectName("Java");
		
		mySession.save(student);
		mySession.save(teacher);
		myTransaction.commit();
		
		System.out.println("Successfully save");
		mySession.close();
		

	}

}
