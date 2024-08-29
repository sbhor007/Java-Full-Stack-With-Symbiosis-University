// Menudrivan Program For Basic MAthematical Operations

import java.util.Scanner;

public class Assignment2 {
	
	private void menu() {
		System.out.println("------MENU------");
		System.out.println("1. Addtion\n2. Substraction\n3. Division\n4. Multiplication");
	}
	public void calculate() {
		Scanner scan = new Scanner(System.in);
		float no1,no2;
		int choice=0;
		char ch;
		do {
			this.menu();
			System.out.print("Enter Your Choice : ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter A First Number : ");
				no1 = scan.nextFloat();
				System.out.print("Enter A Second Number : ");
				no2 = scan.nextFloat();
				System.out.println("Addition : " + (no1 + no2));
				break;
				
			case 2:
				System.out.print("Enter A First Number : ");
				no1 = scan.nextFloat();
				System.out.print("Enter A Second Number : ");
				no2 = scan.nextFloat();
				System.out.println("Substraction : " + (no1 - no2));
				break;
				
			case 3:
				System.out.print("Enter A First Number : ");
				no1 = scan.nextFloat();
				System.out.print("Enter A Second Number : ");
				no2 = scan.nextFloat();
				System.out.println("Division : " + (no1 / no2));
				break;
				
			case 4:
				System.out.print("Enter A First Number : ");
				no1 = scan.nextFloat();
				System.out.print("Enter A Second Number : ");
				no2 = scan.nextFloat();
				System.out.println("Multiplication : " + (no1 * no2));
				break;
				
			default:
				System.out.println("Wrong Input...");
			}
			System.out.print("Do You  Want To Again (Y/N) : ");
			ch = scan.next().charAt(0);
			
		}while(ch=='y' || ch == 'Y');
	}

	public static void main(String[] args) {
		Assignment2 calc = new Assignment2();
		calc.calculate();
	}

}
