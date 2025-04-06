package com.trg.Application;

public class Country {
	private String name;
	private int noOfstates;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfstates() {
		return noOfstates;
	}
	public void setNoOfstates(int noOfstates) {
		this.noOfstates = noOfstates;
	}
	public Country(String name, int noOfstates) {
		super();
		this.name = name;
		this.noOfstates = noOfstates;
	}
	
	
}
