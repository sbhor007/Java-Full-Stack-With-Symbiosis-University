

import java.util.Scanner;

public class Batch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] batch = new Student[2];
		int rollNo,noOfSubjects;
		String studName;
		String className;
		for(int i = 0; i < batch.length;i++)
		{
			System.out.println("----------------------------");
			System.out.println("BATCH : " + (i+1));
			System.out.println("----------------------------");
			System.out.print("Roll Number : ");
			rollNo = scan.nextInt();
			System.out.print("Student Name : ");
			studName = scan.next();
			System.out.print("Class Name : ");
			className = scan.next();
			System.out.print("Number of Subjects : ");
			noOfSubjects = scan.nextInt();
			batch[i] = new Student(rollNo, studName, className, noOfSubjects);
			batch[i].getSubjectNameAndMarks();
		}
		
		System.out.println("Batch Data");
		for(int i = 0; i < batch.length;i++)
		{
			System.out.println("----------------------------");
			System.out.println("BATCH : " + (i+1));
			System.out.println("----------------------------");
			batch[i].displayStudent();
		}
		
	}
}
class Student
{
	int rollNo,noOfSubjects,totalMarks;
	String studName;
	String className;
	int[] subjectMarks;
	String[] subjectName;
	float percentage;
	Scanner scan = new Scanner(System.in);
	
	public Student(int rollNo,String studName,String className,int noOfSubjects)
	{
		this.rollNo = rollNo;
		this.className = className;
		this.noOfSubjects = noOfSubjects;
		this.subjectName = new String[noOfSubjects];
		this.subjectMarks = new int[noOfSubjects];
	}
	public void getSubjectNameAndMarks() {
		for(int i = 0;i < subjectName.length;i++)
		{
			System.out.println("------Subject - " + (i+1) + "------");
			System.out.println("----------------------------");
			System.out.print("Enter The Subject Name : ");
			subjectName[i] = scan.next();
			System.out.print("Enter The Marks : ");
			subjectMarks[i] = scan.nextInt();
			System.out.println();
		}
	}
	private int  calculateTotalMarks() {
		 int totalMarks = 0;
		for(int i = 0; i < subjectMarks.length;i++)
		{
			totalMarks += subjectMarks[i];
		}
		return totalMarks;
	}
	private float calculatePercentage() {
		this.totalMarks = calculateTotalMarks();
		float percentage =(float) (this.totalMarks / this.noOfSubjects);
		return percentage;
	}
	
	public void displayStudent() {
		System.out.print("Roll Number : " + rollNo);
		System.out.print("Student Name : " + studName);
		System.out.println("Subject Name \tMarks");
		System.out.println("------------------------------");
		for(int i = 0; i < noOfSubjects;i++)
		{
			System.out.println(subjectName[i] + " \t" + subjectMarks[i]);
		}
		this.percentage = calculatePercentage();
		System.out.print("Total Marks : " + this.totalMarks);
		System.out.print("Percentage : " + this.percentage);	
	}
	
	
}
















