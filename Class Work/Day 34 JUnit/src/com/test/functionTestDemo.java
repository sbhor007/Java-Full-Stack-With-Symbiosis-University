package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class functionTestDemo {

	@Test
	void multiply() {
		int a,b;
		a = 5; b = 20;
		assertFalse(200 == (a*b));
	}
	
	@RepeatedTest(5)
	@Disabled
	void numberTest() {
		int expectedValue = 120;
		int actualValue = FunctionClass.m1(5);
		assertEquals(expectedValue, actualValue);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {5,6})
	@Disabled
	void paramTest(int param) {
		int expectedValue = 120;
		int actualValue = FunctionClass.m1(param);
		assertEquals(expectedValue, actualValue);
	}
	@ParameterizedTest
	@ValueSource(ints = {121,122})
	void palindromeTest(int param) {
		int expectedValue = 1;
		int actualValue = FunctionClass.m2( param);
		assertEquals(expectedValue, actualValue);
	}

}
