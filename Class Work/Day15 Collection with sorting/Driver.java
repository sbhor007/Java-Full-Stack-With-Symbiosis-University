package Day17Assignment;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Book implements Comparable<Book> {
	private String bookName, bookAuthor, publisher;
	private int bookId;

	public Book(int bookId, String bookName, String bookAuthor, String publisher) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.publisher = publisher;
		this.bookId = bookId;
	}

	

	@Override
	public String toString() {
		return "Book [\nbookId : " + bookId + "\nbookName : " + bookName + "\nbookAuthor : " + bookAuthor
				+ "\npublisher : " + publisher + "\n]";
	}

	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		if(bookId == book.bookId)
			return 0;
		else if(bookId > book.bookId) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Scanner scan = new Scanner(System.in);
		char ch;
		int a = 2;
//		System.out.println(type);

		do {
			String bookName, bookAuthor, publisher;
			int bookId = 0;

			try {
				System.out.println("Enter Book id : ");
				bookId = scan.nextInt();
				System.out.println("Enter Book Name : ");
				bookName = scan.next();
				System.out.println("Enter Book Author Name : ");
				bookAuthor = scan.next();
				System.out.println("Enter Book Publisher : ");
				publisher = scan.next();
				books.add(new Book(bookId, bookName, bookAuthor, publisher));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Do You Want To Store Another record (Y/N) : ");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		System.out.println("-----Befor Sorting---------");
		for (Book b : books) {
			System.out.println(b);
		}
		System.out.println("-----After Sorting---------");
		Collections.sort(books);
		for (Book b : books) {
			System.out.println(b);
		}
	}

}
