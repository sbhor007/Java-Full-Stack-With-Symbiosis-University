package com.trg;
/*
 * POJO (pureOldJavaObject / entity/ model(MVC) 
 * Used for CRUD or Database entry
 * Genaraly This class will not have any logic or methods
 * this class contents private variables (represents columns from DB)
 * getter/setters + constructor + toString()
 */

import javax.management.loading.PrivateClassLoader;

public class Customer {
	private int custId;
	private String custName;	
	
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}



	public static void main(String[] args) {
		
	}
	
}
