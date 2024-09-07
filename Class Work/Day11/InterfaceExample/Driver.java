package InterfaceExample;

import java.util.Scanner;

public class Driver {

	static SavingAccount createSavingAccount() {

		Scanner scan = new Scanner(System.in);
		String accHolderName,city,accNo;
		float openingBal;
		
		System.out.print("Enter a Account Holder Name : ");
		accHolderName = scan.next();
		
		System.out.print("Enter A City : ");
		city = scan.next();
		
		System.out.print("Enter a account No : ");
		accNo = scan.next();
		
		System.out.print("Enter a openning Balance : ");
		openingBal = scan.nextFloat();
		SavingAccount s1 = new SavingAccount(accNo, openingBal, accHolderName, city);

		return s1;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char ch;

		SavingAccount s1 = createSavingAccount();
		System.out.println(s1);

		do {
			int choice;
			float amount;
			System.out.print("\n1. Deposite Amount\n" + "2. Withdraw Amount\n" + "3. Check Balance\n"
					+ "4. Get Account Info\n" + "Enter Your Choice : ");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter amount :");
				amount = scan.nextFloat();
				s1.Deposit(amount);
				System.out.println("Account Balance : " + s1.getAccountBalance());
				break;

			case 2:
				System.out.print("Enter amount :");
				amount = scan.nextFloat();
				s1.withdraw(amount);
				System.out.println("Available Balance :" + s1.getAccountBalance());
				break;

			case 3:
				System.out.println("Available Balance :" + s1.getAccountBalance());
				break;

			case 4:
				System.out.println(s1);

			default:
				System.out.println("Invalid Input...");

			}
			System.out.print("Do You Want To Again (Y/N) : ");
			ch = scan.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
	}

}
