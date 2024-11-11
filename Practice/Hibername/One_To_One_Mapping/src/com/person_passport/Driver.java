package com.person_passport;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	
	static void passportMenu() {
		System.out.println("\n1) create passoport"
				+ "\n2) Retrive Passport Details with there id"
				+ "\n3) Update Passport Details based on id"
				+ "\n4) Delete Passport");
	}
	static void updateMenu() {
		System.out.println("\n1) Update Name\n2)ExpiryDate");
	}
	
	static Date getDate() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Year : ");
		int year = scan.nextInt();
		System.out.print("Month No : ");
		int monthNo = scan.nextInt();
		System.out.println("Day : ");
		int day = scan.nextInt();
		return new Date(year,monthNo,day);
		
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//TODO: change date formate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction;
		Scanner scan = new Scanner(System.in);
		
		char goToMainMainu = 'n';
		try {
			do {
				passportMenu();
				System.out.print("Enter Your Choice : ");
				int passportMenuChoice = scan.nextInt();
				switch(passportMenuChoice) {
				case 1:
					char goCreatePassbook = 'n';
					do {
						transaction  = session.beginTransaction();
						Person person = new Person();
						System.out.print("Enter Person Name : ");
						person.setPersonName(scan.next());
						System.out.print("Enter Person Age : ");
						person.setPersonAge(scan.nextInt());
						Passport passport = new Passport();
						System.out.print("Enter Passport Nnumber : ");
						passport.setPassportNumber(scan.next());
						try {
							passport.setIssueDate(new Date());
							System.out.println("Enter Expiry Date");
							passport.setExpiyDate(getDate());
							passport.setPerson(person);
							person.setPassport(passport);
							session.save(person);
							session.save(passport);
							transaction.commit();
							
						} catch (Exception e) {
							System.out.println("");
						}
						System.out.print("\nAdd Another Passbook (y/n): ");
						goCreatePassbook = scan.next().charAt(0);
					}while(goCreatePassbook == 'y' || goCreatePassbook == 'Y');			
					break;
				case 2:
					System.out.println("Enter Person Id : ");
					int personId = scan.nextInt();
					Person person = (Person)session.get(Person.class, personId);
					if(person != null) {
						System.out.println(person);
					}else {
						System.out.println("Person not found");
					}
					break;
				case 3:
					
					updateMenu();
					System.out.print("\nEnter choice : ");
					int updateChoice = scan.nextInt();
					switch(updateChoice){
					case 1:
						System.out.println("Enter Person ID : ");
						personId = scan.nextInt();
						Person p = (Person)session.get(Person.class, personId);
						if(p != null) {
							System.out.print("Enter Person Name : ");
							String personName = scan.next();
							p.setPersonName(personName);
							System.out.println("Person Name update Successfully");
						}else {
							System.out.println("ID Not Found");
						}						
						break;
					case 2:
						System.out.println("Enter Person ID : ");
						personId = scan.nextInt();
						Passport ps  = (Passport)session.get(Passport.class, personId);
						if(ps != null) {
							System.out.print("Enter Passport Expiry Date : ");
							ps.setExpiyDate(getDate());
							System.out.println("update Successfully");
						}else {
							System.out.println("ID Not Found");
						}		
						break;
						default:
							System.out.println("Invalid input...");
					}
					break;
				case 4:
					System.out.println("Enter Persron Id : ");
					personId = scan.nextInt();
					
					break;
					default:
						System.out.println("Invalid Input");
				}
				System.out.println("\nGo to main menu (y/n): ");
				goToMainMainu = scan.next().charAt(0);
			}while(goToMainMainu == 'y' || goToMainMainu == 'Y');
		} catch (Exception e) {
			System.out.println("main::ERROR" + e.getMessage());
			scan.next();
		}
		
		
//		Passport p1 = new Passport();
//		p1.setPassportNumber("123456");
//		p1.setIssueDate(new Date());
//		p1.setExpiyDate(new Date(2026,11,22));
//		
//		Person person = new Person();
//		person.setPersonName("Santosh");
//		person.setPersonAge(21);
//		person.setPassport(p1);
//		p1.setPerson(person);
//		
//		session.save(p1);
//		session.save(person);
//		transaction.commit();
//		System.out.println("Transaction success");
		session.close();
		sessionFactory.close();
	}

}
