package SQLPractice;

import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char ch;
		do {
			System.out.print("1. Display all details Depends on transaction type\n"
					+ "2. Display AccountNo, Account Holder Name for both deposit and withdrawal done in the month\n"
					+ "3. Display all transction for particular AccountNo\n"
					+ "4. Display all  Account holders whose are not from pune and Mumbai\n"
					+ "5. Display unique locations and how many of them\n"
					+ "6. select min and max transaction amount in a month\n"
					+ "7. display total transaction till know\n"
					+ "Enter A Choice : "
					);
			int choice = scan.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.print("Enter Transaction Type : ");
					String transactionType = scan.next();
					Account.showTransactionType(transactionType);
					break;
				case 2:
					System.out.print("Enter Month No (January = 1) :");
					int monthNo = scan.nextInt();
					Account.showBothTransactionTypeAndInMonth(monthNo);
					break;
				case 3:
					System.out.print("Enter Account No : ");
					int accNo = scan.nextInt();
					Account.showAllTransactions(accNo);
					break;
				case 4:
					Account.showAccountHoldersNotPuneMumbai();
					break;
				case 5:
					Account.countLocations();
					break;
				case 6:
					System.out.print("Enter Month No (January = 1) :");
					monthNo = scan.nextInt();
					Account.findMinMaxAmountWithMonth(monthNo);
				case 7:
					System.out.println(400);
					System.out.println("page not found....");
//					System.out.print("Enter Date (YYYY-MM-DD) : ");
//					String date = scan.next();
//					Account.countTransactionsInADate(date);
					default:
						System.out.println("please enter Valid input...");
				}
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Do You Want Again (y/n) : ");
			ch = scan.next().toUpperCase().charAt(0);
		}while(ch == 'Y');

	}
}
