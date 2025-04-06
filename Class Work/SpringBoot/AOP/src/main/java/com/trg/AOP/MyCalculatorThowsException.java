package com.trg.AOP;


public class MyCalculatorThowsException {
	public int add(int a,int b) {
		System.out.println("Inside add from exception");
		throw new RuntimeException();
	}
}
