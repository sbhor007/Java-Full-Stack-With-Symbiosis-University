package ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String massage) {
		super(massage);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a age : ");
		age = scan.nextInt();
		try {
			if(age < 0) {
				throw new MyException("Invalid Age");
			}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Success");
		}

	}

}
