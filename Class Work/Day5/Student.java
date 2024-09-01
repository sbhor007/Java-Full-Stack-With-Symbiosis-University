import java.util.Scanner;

public class Student {
	int rollNo;
	String studeName;
	public Student(int rollNo,String studName)
	{
		this.rollNo = rollNo;
		this.studeName = studName;
	}
	
	public void show()
	{
		System.out.println("Student Roll No. : " + this.rollNo + "\nStudent Name : " + this.studeName);
		System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Student[] stud = new Student[3];
		
		for(int i = 0; i< stud.length;i++)
		{
			System.out.println("Student - " + (i+1));
			System.out.print("Enter Student Roll Number : ");
			int rollNo = scan.nextInt();
			
			System.out.print("Enter Student Name : ");
			String studName = scan.next();
			
			stud[i] = new Student(rollNo, studName);
			
			System.out.println("\n--------------------------\n");
		}
		
		System.out.println("---Student Detail---");
		
		for(int i = 0; i <stud.length;i++) {
			stud[i].show();
		}

	}

}
