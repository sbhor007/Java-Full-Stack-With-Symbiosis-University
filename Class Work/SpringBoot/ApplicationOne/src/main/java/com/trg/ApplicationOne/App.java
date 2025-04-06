package com.trg.ApplicationOne;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	Employee e = new Employee();
    	System.out.println("---Enter Employee Details---");
    	System.out.print("ID : ");
    	e.setEmployeeId(scan.nextInt());
    	System.out.print("Name : ");
    	e.setName(scan.next());
    	Address address = new Address();
    	System.out.println("---Enter Employee Details---");
    	System.out.print("Contry : ");
    	address.setCountry(scan.next());
    	System.out.print("Street : ");
    	address.setStreet(scan.next());
    	System.out.print("PinCode : ");
    	address.setPincode(scan.next());
    	e.setAddress(address); // setter injection
    	
    	System.out.println("Employee details : \n" + e);
    	
    }
}
