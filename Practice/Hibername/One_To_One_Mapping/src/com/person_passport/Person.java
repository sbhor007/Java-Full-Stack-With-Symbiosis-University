package com.person_passport;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	@Column(name = "personName",nullable = false)
	private String personName;
	@Column(name = "personAge",nullable = false)
	private int personAge;
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	public Person( String personName, int personAge, Passport passport) {
		this.personName = personName;
		this.personAge = personAge;
		this.passport = passport;
	}
	
	public Person() {
	}	
}
