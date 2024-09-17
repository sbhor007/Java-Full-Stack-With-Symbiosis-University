package Day17Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student \n[\nrollNo : " + rollNo + "\nname : " + name + "\nage : " + age + "\n]";
	}
}

class studentRollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.rollNo == o2.rollNo)
			return 0;
		else if (o1.rollNo > o2.rollNo)
			return 1;
		else
			return -1;
	}

}

class studentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.age == o2.age)
			return 0;
		else if (o1.age > o2.age)
			return 1;
		else
			return -1;
	}

}

class studentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class ComparatorSortingExample {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			int choice;
			System.out.println("\n1. To Add Student Record." + "\n2. To Display Student Record"
					+ "\n3. To sort Student Record with Roll No" + "\n4. To sort Student Record with Name"
					+ "\n5. To sort Student Record with Age" + "\nEnter Your Choice : ");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				do {
					try {

						System.out.print("Enter Student Roll No : ");
						int rollNo = scan.nextInt();
						System.out.print("Enter Student Name : ");
						String name = scan.next();
						System.out.print("Enter Student Age : ");
						int age = scan.nextInt();

						students.add(new Student(rollNo, name, age));

					} catch (Exception e) {
						System.out.println(e.getMessage());
						scan.nextLine();
					}
					System.out.print("Do You Want Add Another Record (y/n) : ");
					ch = scan.next().charAt(0);
				} while (ch == 'y' || ch == 'Y');
				break;
			case 2:
				for (Student s : students) {
					System.out.println(s);
				}
				break;
			case 3:
				System.out.println("-----Sort With Roll No------");
				Collections.sort(students, new studentRollNoComparator());
				for (Student s : students) {
					System.out.println(s);
				}
				break;
			case 4:
				System.out.println("-----Sort With Name-----");
				Collections.sort(students, new studentNameComparator());
				for (Student s : students) {
					System.out.println(s);
				}
				break;
			case 5:
				System.out.println("-----Sort With Age-----");
				Collections.sort(students, new studentAgeComparator());
				for (Student s : students) {
					System.out.println(s);
				}
				break;
			default:
				System.out.println("Invalid Input....");
			}

			System.out.print("\nGot for Main Mainu (y/n) : ");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		System.out.println("program exit");

	}
}

/*
 * students.add(new Student(13,"Santosh", 21)); students.add(new
 * Student(1,"Adity", 20)); students.add(new Student(59,"Harshal", 20));
 * students.add(new Student(28,"Durgesh", 20));
 * 
 * 
 * System.out.println("\n------Before Sorting-------\n"); for(Student s :
 * students) { System.out.println(s); }
 * 
 * System.out.println("\n\n------Sorting with Roll No-------\n");
 * Collections.sort(students,new studentRollNoComparator()); for(Student s :
 * students) { System.out.println(s); }
 * 
 * System.out.println("\n\n------Sorting with Name-------\n");
 * Collections.sort(students,new studentNameComparator()); for(Student s :
 * students) { System.out.println(s); }
 * 
 * System.out.println("\n\n------Sorting with Age-------\n");
 * Collections.sort(students,new studentAgeComparator()); for(Student s :
 * students) { System.out.println(s); }
 */
//	}

//}
