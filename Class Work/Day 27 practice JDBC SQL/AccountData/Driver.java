package AccountData;

import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	enum TransactionType{
		withdraw,deposit;

	}
	enum Months {
		january(1), february(2), march(3), april(4), may(5), june(6), july(7), august(8), september(9), october(10), november(11), december(13);
		int monthNo;
		private Months(int monthNo) {
			this.monthNo = monthNo;
		}
		public int getMonthNo() {
			return monthNo;
		}
				
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TransactionType tType[] = TransactionType.values();
		Months months[] = Months.values();
		char goMenu;
		do {

			System.out.print("\n1. Insert Data" + "\n2. Get Transaction Type Information"
					+ "\n3. Get Monthly Trasaction Details" + "\n4. Get all transaction by specific account Number"
					+ "\n5. Get Transaction BelowAmount" + "\n6. Get NON pune mumbai Account Holders"
					+ "\n7. Get Min Max Transaction Amount in a month" + "\nEnter Your choise : ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				char ch = 'N';

				do {
					try {
						System.out.println("Enter Account Information");
						System.out.print("Account No : ");
						int accountNo = scan.nextInt();
						System.out.println("Account Holder Name : ");
						String accountHolderName = scan.next();
						System.out.println("Amount : ");
						int amount = scan.nextInt();
						System.out.println("Select a Transaction Type");
						int i = 1;
						for (TransactionType t : tType) {
							System.out.println(i++ + ". " + t);
						}
						int optionNo = scan.nextInt();
						String TransactionType = tType[optionNo - 1].toString();

						System.out.println("Enter Date (YYYY-MM-DD)");
						String date = scan.next();
						// TODO : get System Date

						System.out.println("Address");
						String address = scan.next();

						Account.insertRecord(accountNo, accountHolderName, amount, TransactionType, Date.valueOf(date),
								address);

					} catch (InputMismatchException e) {
						System.out.println(e.getMessage());
					}
					System.out.println("Do You Want To Add Another record (Y/N): ");
					ch = scan.next().toUpperCase().charAt(0);
				} while (ch == 'Y');
				break;
			case 2:
				System.out.println("Select a Transaction Type");
				int i = 1;
				for (TransactionType t : tType) {
					System.out.println(i++ + ". " + t);
				}
				System.out.print("Enter Your Choice : ");
				int optionNo = scan.nextInt();
				String TransactionType = tType[optionNo - 1].toString();
				Account.getTransactionTypeInformation(TransactionType);
				break;
			case 3:
				i = 1;
				for (Months month : months) {
					System.out.println(i++ + ". " + month);
				}
				System.out.print("Select Month : ");
				int monthNo = scan.nextInt();
				String month = months[monthNo - 1].toString();
				Account.getMonthlyTransactionDetails(month);
				break;
			case 4:
				System.out.print("Enter Account Number : ");
				int accountNo = scan.nextInt();
				Account.getAllTrnsactionByAccountNo(accountNo);
				break;
			case 5:
				System.out.print("Enter Ammount : ");
				int amount = scan.nextInt();
				Account.getTransactionsBelowAmount(amount);
				break;
			case 6:
				Account.getNonPuneMumbaiAccountHolders();
				break;
			case 7:
				i = 1;
				for (Months m : months) {
					System.out.println(i++ + ". " + m);
				}
				System.out.print("Select Month : ");
				monthNo = scan.nextInt();
				month = months[monthNo - 1].toString();
				Account.getMinMaxTransactionAmountInMonth(month);
				break;
			default:
				System.out.println("Invalid input");
			}
			
			System.out.print("Go To The Main Mainu (Y/N) : ");
			goMenu = scan.next().toUpperCase().charAt(0);

		} while (goMenu == 'Y');
	}
}
