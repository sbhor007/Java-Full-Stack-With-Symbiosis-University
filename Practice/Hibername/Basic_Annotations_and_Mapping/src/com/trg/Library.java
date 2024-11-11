package com.trg;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "libraryId")
	private int libraryId;
	@Column(name = "libraryName")
	private String libraryName;
	@OneToMany(mappedBy = "library")
	List<Book> book;

	public int getLibraryId() {
		return libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public Library(String libraryName) {
		super();
		this.libraryName = libraryName;
	}
	public Library() {
		
	}
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", book=" + book + "]";
	}
	
	
	
	
}
