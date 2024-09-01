

import java.util.*;
public class CheckIsPositive {
	
	int number;
	public CheckIsPositive(int number) {
		this.number = number;
	}
	public int isPositive() {		
		if(this.number >=0)
			return 1;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check is positive or negative : ");
		int number = scan.nextInt();
		CheckIsPositive c = new CheckIsPositive(number);
		/*if(c.isPositive()) {
			System.out.println("Given Number is Positive");
		}else {
			System.out.println("Given Number is negative");
		}*/
		
		
		//testing
		//boolean ans = c.isPositive();
		switch(c.isPositive()) {
		case 1:
			System.out.println("Given Number is Positive");
			break;
		default:
			System.out.println("Given Number is Negative");
			break;
		}

	}

}
