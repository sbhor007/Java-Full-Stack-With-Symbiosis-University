import java.util.Scanner;

public class Batch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[][] batch = new Student[2][];
		int rollNo,noOfSubjects;
		String studName;
		String className;
		for(int i = 0; i < batch.length;i++)
		{
			System.out.println("----------------------------");
			System.out.println("BATCH : " + (i+1));
			System.out.println("----------------------------");
			System.out.print("No of Students in Batch - " + (i+1) + " : ");
			batch[i] = new Student[scan.nextInt()];
			for(int j = 0;j < batch[i].length;j++)
			{
				System.out.println("\nStudent - " + (j+1));
				System.out.print("Roll Number : ");
				rollNo = scan.nextInt();
				System.out.print("Student Name : ");
				studName = scan.next();
				System.out.print("Class Name : ");
				className = scan.next();
				System.out.print("Number of Subjects : ");
				noOfSubjects = scan.nextInt();
				batch[i][j] = new Student(rollNo, studName, className, noOfSubjects);
				batch[i][j].getSubjectNameAndMarks();
			}

		}
		
		System.out.println("Batch Data");
		for(int i = 0; i < batch.length;i++)
		{
			System.out.println("----------------------------");
			System.out.println("BATCH : " + (i+1));
			System.out.println("----------------------------");
			for(int j = 0; j < batch[i].length;j++)
			{
				System.out.println("\nStudent - " + (j+1));
				batch[i][j].displayStudent();
			}
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
			System.out.println("Subject - " + (i+1) );
			
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
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Student Name : " + studName);
		System.out.println("Subject Name \tMarks\n");
		
		for(int i = 0; i < noOfSubjects;i++)
		{
			System.out.println(subjectName[i] + " \t\t" + subjectMarks[i]);
		}
		this.percentage = calculatePercentage();
		
		System.out.println("\nTotal Marks : " + this.totalMarks);
		System.out.println("Percentage : " + this.percentage);
		System.out.println("------------------------------");
	}
	
	
}
















