package com.trg;

import javax.persistence.*;

/*
 * Book entity with fields id, title, author, and price.
 */

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookId")
	private int bookId;
	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "libraryId")
	private Library library;
	
	public int getBookId() {
		return bookId;
	}
//	public void setBookId(int bookId) {
//		this.bookId = bookId;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book() {
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public Book(String title, String author, double price, Library library) {

		this.title = title;
		this.author = author;
		this.price = price;
		this.library = library;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + ", library="
				+ library + "]";
	}
	
	
	
	
	
}
