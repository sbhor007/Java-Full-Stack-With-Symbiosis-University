import java.util.*;

public class Voter {
	int age;
	String studentName;
	public Voter(int age,String studentName) {
		this.age = age;
		this.studentName = studentName;
	}
	
	public boolean isAgeValidate() {
		if(this.age >=18)
			return true;
		return false;
	}
	public void show() {
		System.out.println("Age : " + this.age + "\nStudent Name : " + this.studentName);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Student Age : ");
		int age = scan.nextInt();
		System.out.print("Enter A Student Name : ");
		String studentName = scan.next();
		
		Voter santosh = new Voter(age,studentName);
		if(santosh.isAgeValidate())
		{
			System.out.println("----Voter Information----");
			santosh.show();
		}
		else {
			System.out.println("Are You Not elligible for the vote");
		}
				
	}

}



