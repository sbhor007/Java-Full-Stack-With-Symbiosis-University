package com.trg.ApplicationOne;

public class Address {
	private String street;
	private String country;
	private String pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String street, String country, String pincode) {
		super();
		this.street = street;
		this.country = country;
		this.pincode = pincode;
	}
	
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address \n\t"
				+ "[\n\t\tstreet=" + street 
				+ "\n\t\tcountry=" + country 
				+ "\n\t\tpincode=" + pincode + "\n\t]";
	}
	
	
}
