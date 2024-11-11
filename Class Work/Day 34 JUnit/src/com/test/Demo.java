package com.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Demo {
// Lifecuicle of JUnit testing
	@BeforeAll
	static void beforeAll() {
		System.out.println("**-- 1) Exicuted onece before all test methods in this class --**");
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("**-- 2) Exicuted  before Each test methods in this class --**");
	}
	
	@Test
	void testMethod1() {
		System.out.println("**-- 3) Test Method1 executed --**");
	}
	
	@DisplayName("Test method2 with condition")
	@Test
	void testMethod2() {
		System.out.println("**-- 4) Test method2 executed --**");
	}
	
	@Test
	@Disabled("Implementation Pending")
	void testMethod3() {
		System.out.println("**-- 5) Test method3 executed --**");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("**-- 6) Exicuted after Each Test--**");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("**-- 7) Exicuted oce after all test methods in this class --**");
	}

}
