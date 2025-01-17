package com.person_passport;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "passport")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passportId;
	@Column(name = "passportNumber",nullable = false, unique = true)
	private String passportNumber;
	@Column(name = "issueDate",nullable = false)
	@Temporal(TemporalType.DATE)
	private Date issueDate;
	@Column(name = "expiyDate",nullable = false)
	@Temporal(TemporalType.DATE)
	private Date expiyDate;
	
	@OneToOne
	@JoinColumn(name = "personId")
	private Person person;

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getIssueDate() {
		return issueDate.toString();
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiyDate() {
		return expiyDate.toString();
	}
	public void setExpiyDate(Date expiyDate) {
		this.expiyDate = expiyDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	

	public Passport(String passportNumber, Date issueDate, Date expiyDate, Person person) {
		super();
		this.passportNumber = passportNumber;
		this.issueDate = issueDate;
		this.expiyDate = expiyDate;
		this.person = person;
	}
	
	public Passport() {
		
	}
//TODO:last update
	
	
}
