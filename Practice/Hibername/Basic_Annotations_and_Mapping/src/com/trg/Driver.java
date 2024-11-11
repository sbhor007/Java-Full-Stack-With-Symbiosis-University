package com.trg;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * Create a Book entity with fields id, title, author, and price. Use Hibernate
 * annotations to define the primary key and configure each field. How would you
 * annotate the primary key?
 * Define a Library entity and use a OneToMany relationship
 * with Book. How would you annotate the relationship to cascade changes?
 */

public class Driver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction;
		Scanner scan = new Scanner(System.in);


		try {
			char ch;
			do {
				System.out.print("\n1) Add Libraries \n2) add Books for Library \n Enter Choice : ");
				int mainChoice = scan.nextInt();

				switch (mainChoice) {
				case 1:
					char mainChoiceCh = 'n';
					do {
						transaction = session.beginTransaction();
						System.out.println("Enter Libray Name : ");
						session.save(new Library(scan.next()));
						transaction.commit();
						System.out.println("Library Addedd..");
						System.out.print("Do You Want To Add Another Library(Y/N) : ");
						mainChoiceCh = scan.next().charAt(0);
					} while (mainChoiceCh == 'Y' || mainChoiceCh == 'y');
					break;

				case 2:
					mainChoiceCh = 'n';
					do {
						try {
							transaction = session.beginTransaction();
							Book book = new Book();
							System.out.println("Enter Book Name : ");
							book.setTitle(scan.next());
							System.out.println("Enter Book Author : ");
							book.setAuthor(scan.next());
							System.out.println("Enter Book Price : ");
							book.setPrice(scan.nextDouble());
							System.out.println("Enter Library Name");
							String libraryName = scan.next();
							Library library = (Library) session
									.createQuery("FROM Library WHERE libraryName = :libraryName")
									.setParameter("libraryName", libraryName).uniqueResult();

							if (library != null) {
								book.setLibrary(library);
								session.save(book);
								transaction.commit();
								System.out.println("Book Addedd..");
							} else {
								System.out.println("Invalid Library.. ");
							}

						} catch (Exception e) {
							System.out.println("\nError :: add book ::" + e.getMessage());
						}
						System.out.print("Do You Want To Add Another Book(Y/N) : ");
						mainChoiceCh = scan.next().charAt(0);
					} while (mainChoiceCh == 'Y' || mainChoiceCh == 'y');
					break;

				default:
					System.out.println("Invalid Input");
				}
				System.out.print("\nDo You Want To Againg (y/n) : ");
				ch = scan.next().charAt(0);
			} while (ch == 'Y' || ch == 'y');

		} catch (Exception e) {
			System.out.println("faild");
		} finally {
			sessionFactory.close();
			session.close();
		}

	}

}
