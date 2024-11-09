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
		
		Shape myShape = new Shape("squre");
		Rectangle myRectangle = new Rectangle("rect1",10,20);
		Circle myCircle = new Circle("circle1",2);
		
		mySession.save(myShape);
		mySession.save(myRectangle);
		mySession.save(myCircle);
		
		myTransaction.commit();
		mySession.close();
		System.out.println("Successfully save");

	}

}
