package com.employee_manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class employeeManagerTest {


	
//	private static EmployeeManager empManager;
	private static EmployeeManager cm;
	
	@BeforeAll
	public static void setupAll() {
		//TODO: massage
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("Instantiating Contact Manager");
//		empManager = new EmployeeManager();
		cm = new EmployeeManager();
	}
	
	@Test
	@DisplayName("")
	@Disabled
	public void createContactList() {
//		EmployeeManager empManager = new EmployeeManager();
		EmployeeManager cm = new EmployeeManager();
		cm.addEmp("Santosh", "Bhor", "1234567890");
		assertFalse(cm.getAllEmp().isEmpty());
		assertEquals(1,cm.getAllEmp().size());
	}
	/*
	@Test
	public void testEmployeeData() {
		
		try {
//			EmployeeManager empManager = new EmployeeManager();
			EmployeeManager cm = new EmployeeManager();
			cm.addEmp("Santosh", "Bhor", "1234567890");
			Collection<Employee> employee = cm.getAllEmp();
			for(Employee e: employee) {
				assertAll("EmployeeManager",
						() -> assertEquals("Santosh", e.getFirstname()),
						() -> assertEquals("Bhor", e.getLastname()),
						() -> assertEquals("1234567890", e.getPhoneNo())
						);
			}
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
	*/
	
//	@Test
	@ParameterizedTest
//	@RepeatedTest(1)
	@CsvSource({
				"Santosh,Bhor,1234567890",
				"Harshal,Kolhe,123456780"
			})
	public void testEmployeeData(String firstName,String LastName, String phoneNo) {
		
		try {
//			EmployeeManager empManager = new EmployeeManager();
			EmployeeManager cm = new EmployeeManager();
//			cm.addEmp("Santosh", "Bhor", "1234567890");
			cm.addEmp(firstName, LastName, phoneNo);
			Collection<Employee> employee = cm.getAllEmp();
			System.out.println(employee);
//			for(Employee e: employee) {
//				assertAll("EmployeeManager",
//						() -> assertEquals(firstName, e.getFirstname()),
//						() -> assertEquals(LastName, e.getLastname()),
//						() -> assertEquals(phoneNo, e.getPhoneNo())
//						);
//			}
			employee.forEach((e) -> assertAll("EmployeeManager",
					() -> assertEquals(firstName, e.getFirstname()),
					() -> assertEquals(LastName, e.getLastname()),
					() -> assertEquals(phoneNo, e.getPhoneNo())
					));
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	@Disabled
	public void validateFirstName() {
		try {
//			EmployeeManager empManager = new EmployeeManager();
			EmployeeManager cm = new EmployeeManager();
			cm.addEmp("santosh", "Bhor", "1234567890");
			Collection <Employee> employee = cm.getAllEmp();
			for(Employee e : employee) {
				assertEquals("santosh", e.getFirstname());
			}
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	@Disabled
	public void validateLastName() {
		try {
//			EmployeeManager empManager = new EmployeeManager();
			EmployeeManager cm = new EmployeeManager();
			cm.addEmp("santosh", "Bhor", "1234567890");
			Collection <Employee> employee = cm.getAllEmp();
			
			for(Employee e : employee) {
				assertEquals("Bhor", e.getLastname());
			}
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
	@Test
	@Disabled
	public void validatePhoneNo() {
		try {
//			EmployeeManager empManager = new EmployeeManager();
			EmployeeManager cm = new EmployeeManager();
			cm.addEmp("santosh", "Bhor", "1234567890");
			Collection <Employee> employee = cm.getAllEmp();
			
			for(Employee e : employee) {
				assertEquals("1234567890", e.getPhoneNo());
			}
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	@DisplayName("Test Key Genaration")
	@Disabled
	public void testGenKey() {
//		EmployeeManager empManager = new EmployeeManager();
		EmployeeManager cm = new EmployeeManager();
		cm.addEmp("santosh", "Bhor", "1234567890");
		List <Employee> employee =new ArrayList<Employee>(cm.getAllEmp());
		String expectedValue = "santosh - Bhor";
		
		String actualValue = cm.genKey(employee.get(0));
		assertEquals(expectedValue, actualValue);
		
	}
	
	@AfterEach
	public void afterEachSetup() {
		System.out.println("Clean Up Contact Manager");
//		empManager = null;
		cm = null;
	}
	@AfterAll
	public static void afterAllSetup() {
		System.out.println("End Test");
	}
	
	
	

}
