package com.trg;

import javax.persistence.*;

@Entity
@Table(name = "student")
@PrimaryKeyJoinColumn(name = "studentKey")
public class Student extends Persone {
	@Column(name = "passingYear")
	private String passingYear;

	public String getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}
	
}
