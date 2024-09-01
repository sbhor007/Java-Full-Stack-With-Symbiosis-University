// learn about forEach loop and toString method

import java.util.Scanner;

public class Person {
	
	 String id,personName;
	 int age;
	public Person(String id,String personName,int age) {
		this.id = id;
		this.personName = personName;
		this.age = age;
	}
	
	public void show() {
		System.out.println("Person ID : " + id);
		System.out.println("Person Name : " + personName);
		System.out.println("Person Age : " + age);
		System.out.println();
	}
	
	public String toString() {
		return "[ Person ID : " +id + "\nPerson Name : "+ personName + "\nPerson Age : " + age + " ]";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id,personName;
		int age;
		Person[] persons = new Person[5];
		
		System.out.println("Enter The 5 Persons Details");
		for(int i = 0; i < persons.length;i++)
		{
			System.out.println("\nPERSON - " + (i+1));
			System.out.print("Enter Person ID : ");
			id = scan.next();
			System.out.print("Enter Person Name : ");
			personName = scan.next();
			System.out.print("Enter Person Age : ");
			age = scan.nextInt();
			persons[i] = new Person(id, personName, age);
		}
		
		System.out.println("\nPerson Details\n");
//		for(int i = 0; i < persons.length;i++)
//		{
//			System.out.println("\nPERSON - " + (i+1));
//			persons[i].show();
//		}
		for(Person p : persons) {
//			System.out.println("Person ID : " + p.id);
//			System.out.println("Person Name : " + p.personName);
//			System.out.println("Person Age : " + p.age);
			
			System.out.println(p);
			System.out.println();
		}
	}

}
