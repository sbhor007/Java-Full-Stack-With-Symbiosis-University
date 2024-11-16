package com.user_address;
/*
*Create two entities, User and Address, where each user has one address.
*
*Use a foreign key column to map the relationship instead of a shared primary key.
*
*Update the Address entity to contain a foreign key referencing the User entity's primary key.
*
*Test CRUD operations and check how the foreign key behaves in the database.
*/

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction;

		try {
			char mainMenu = 'n';
			do {
				System.out.print("\n1. Add User Details with its Address" + "\n2. Update User Details"
						+ "\n3. Delete User" + "Enter Your Choice : ");
				int mainMenuChoice = scan.nextInt();
				switch (mainMenuChoice) {
				case 1:
					// Add user_Address Records
					char ch = 'n';
					do {

						try {
							transaction = session.beginTransaction();
							User user = new User();
							System.out.print("Enter User Name : ");
							user.setUsername(scan.next());
							System.out.print("Enter Email : ");
							user.setEmail(scan.next());
							Address address = new Address();
							System.out.println("----Enter Address Details----");
							System.out.print("Enter Street : ");
							address.setStreet(scan.next());
							System.out.print("Enter City : ");
							address.setCity(scan.next());
							System.out.print("Enter Zipcode : ");
							address.setZipcode(scan.next());
							address.setUser(user);
							user.setAddress(address);

							session.save(user);
							session.save(address);
							transaction.commit();

							System.out.println("User Data Added...");
							user = null;
							address = null;

						} catch (Exception e) {
							System.err.println(e.getMessage());
							scan.nextLine();
						}
						System.out.print("\nAdd Another Record (y/n): ");
						ch = Character.toLowerCase(scan.next().charAt(0));

					} while (ch == 'y');
					break;

				case 2:
					// Update user address details

					System.out.print("Enter User Id : ");
					int userId = scan.nextInt();
					User user = (User) session.get(User.class, userId);
					if (user != null) {
						System.out.print("\n---Update User----" + "\n1. Username" + "\n2. Email" + "\n3. Street"
								+ "\n4. City" + "\n5. Zipcode" + "\nEnter Choice : ");
						int updateMenuChoice = scan.nextInt();
						transaction = session.beginTransaction();
						switch (updateMenuChoice) {
						case 1:
							System.out.print("Enter New Username : ");
							user.setUsername(scan.next());
							transaction.commit();
							System.out.println("Username updated..\n");
							break;
						case 2:
							System.out.print("Enter New Email ID : ");
							user.setEmail(scan.next());
							transaction.commit();
							System.out.println("Email updated..\n");
							break;
						case 3:
							System.out.print("Enter New Street : ");
							user.getAddress().setStreet(scan.next());
							transaction.commit();
							System.out.println("Street updated..\n");
							break;
						case 4:
							System.out.print("Enter New City : ");
							user.getAddress().setCity(scan.next());
							transaction.commit();
							System.out.println("City updated..\n");
							break;
						case 5:
							System.out.print("Enter New Zipcode : ");
							user.getAddress().setZipcode(scan.next());
							transaction.commit();
							System.out.println("Zipcode updated..\n");
							break;
						default:
							System.out.println("Invalid Choice....");
						}
						// close update switch case
					} else {
						System.out.println("User not found");
					}
					user = null;
					break;
				case 3:
					System.out.print("Enter User Id : ");
					userId = scan.nextInt();
					transaction = session.beginTransaction();
					user = (User) session.get(User.class, userId);
					if (user != null) {
						session.delete(user);
						transaction.commit();
						System.out.println("User Deleted");

					} else {
						System.out.println("user not found...");
					}
					break;

				default:
					System.out.println("Invalid Input");
				}
				// close main switch case
				System.out.print("\nGo to the mainu (y/n)");
				mainMenu = Character.toLowerCase(scan.next().charAt(0));
			} while (mainMenu == 'y');

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			sessionFactory.close();
			session.close();
		}
	}
}
