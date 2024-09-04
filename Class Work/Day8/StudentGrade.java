import java.util.Arrays;
import java.util.Scanner;

class Person
{
	String rollNo,personName,className;

	public Person(String rollNo, String personName, String className) {
		this.rollNo = rollNo;
		this.personName = personName;
		this.className = className;
	}
	
}

class Student extends Person
{
	int[] subMarks = new int[5];
	float studPercentage;
	int totalmarks;

	public Student(String rollNo, String personName, String className) {
		super(rollNo, personName, className);
	}
	
	public void setSubMarks() {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < subMarks.length;i++) {
			System.out.println("Subject - " + (i+1) + " : ");
			this.subMarks[i] = scan.nextInt();	
		}
	}
	private int totalMarks()
	{
		int sum = 0;
		for(int marks : subMarks) {
			sum += marks;
		}
		return sum;
	}
	private float calculatePercentage() {
		this.totalmarks = totalMarks();
		return (float)this.totalmarks / 5;
	}
	
	public char claculateGrade() {

		this.studPercentage = calculatePercentage();
		
		if(studPercentage >= 90 && studPercentage <= 100)
			return 'O';
		else if(studPercentage >= 75)
			return 'A';
		else if(studPercentage >= 60)
			return 'B';
		else if(studPercentage >= 50)
			return 'C';
		else if(studPercentage >=40)
			return 'D';
		else
			return 'F';
	}

	@Override
	public String toString() {
		char grade = claculateGrade();
		return "\n[\n"
				+ "Student RollNo = " + rollNo
				+ "\nStudent Name = " + personName
				+ "\nStudent Class = " + className
				+ "\nTotal Marks = " + this.totalmarks + "/500" 
				+ "\nPercentage = " + studPercentage 
				+"\nGrade = " + grade
				+ "\n]";
	}
	
}


public class StudentGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String rollNo,studName,className;
		int noOfStudent;
		System.out.print("How Many student in a batch : ");
		noOfStudent = scan.nextInt();
		Student[] batch = new Student[noOfStudent];
		
		for(int i = 0; i < batch.length; i++) {
			System.out.println("----------STUDENT - " + (i+1) + "-------------");
			System.out.print("Enter Student RollNo : ");
			rollNo = scan.next();
			
			System.out.print("Enter Student Name : ");
			studName = scan.next();
			
			System.out.print("Enter Student Class Name : ");
			className = scan.next();
			
			batch[i] = new Student(rollNo, studName, className);
			System.out.println("Enter A Subject Maraks");
			batch[i].setSubMarks();
			
			System.out.println("\n---------------------------------------\n");
		}
		
		
		for(Student stud : batch)
		{			
			System.out.println(stud);
			System.out.println();
		}
		
		

	}

}
