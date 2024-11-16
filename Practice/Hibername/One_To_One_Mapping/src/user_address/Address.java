package com.user_address;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	private String street;
	private String city;
	private String zipcode;
//	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_id")
	private User user;

	public int getAddressId() {
		return addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address(String street, String city, String zipcode, User user) {
		super();
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
		this.user = user;
	}

	public Address() {
	}

}
