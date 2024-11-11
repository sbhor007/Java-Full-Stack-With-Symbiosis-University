package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitExamples {
	
	@Test
	@DisplayName("test case Display Name")
	void test() {
		System.out.println("test 1");
	}
	@Test
	void method() {
		System.out.println("Test case " + " Method One");
	}
	@Test
	@Disabled("Out of implementation")
	void method2() {
		System.out.println("Test Method 2");
	}
}
