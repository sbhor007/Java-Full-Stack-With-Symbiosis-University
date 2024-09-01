/*
 * program for banking system with functionality of create customer, depositing
 * and withdrawal falcility for N number of custome where the balance is only
 * available to the particular user 
 */

import java.util.Scanner;

public class Bank {
	private float accountBalance;
	static int id;
	private int custId;
	String accountHolderName;
	static {
		id = 1000;
	}

	public Bank(String accountHolderName) {
		this.custId = id;
		this.accountHolderName = accountHolderName;
		id++;
	}

//	public void setAccountHolderName(String accountHolderName) {
//		this.accountHolderName = accountHolderName;
//	}

	public int getCustId() {
		return custId;
	}

	public boolean balanceDeposit(float depositedAmount) {
		if (depositedAmount > 0) {
			accountBalance += depositedAmount;
			return true;
		}
		return false;

	}

	public boolean balanceWithdrwal(float amount) {
		if (this.accountBalance < amount && amount != 0) {
			return false;0
		} else {
			this.accountBalance -= amount;
			return true;
		}
	}

	public String toString() {
		return "[\n" + "custID : " + custId + "\nAccount Holder Name : " + accountHolderName + "\naccountBalance : "
				+ accountBalance + "\n]";
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public static int validateCustomerId(int id, Bank[] obj) {
		for (int i = 0; i < obj.length; i++) {
			if (id == obj[i].getCustId()) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		/*
		 * System.out.print("Enter The customer name : ");
		 */
//		String custName1 = scan.next();

		System.out.println("How many customer records do you want : ");
		int noOfCust = scan.nextInt();
		Bank[] customers = new Bank[noOfCust];

		System.out.println("Enter Customer Details :");
		for (int i = 0; i < customers.length; i++) {
			System.out.print("Enter The customer name : ");
			String custName = scan.next();
			customers[i] = new Bank(custName);
		}

		// Testing
		for (Bank customer : customers) {
			System.out.println(customer);
		}

//		Bank customer = new Bank(custName1);
		do {
			System.out.print("Enter Your Customer id To Perform Specific Transaction : ");
			int custId = scan.nextInt();

			int custValidIndex = validateCustomerId(custId, customers);
			if (custValidIndex == -1) {
				System.out.println("Your Customer Id Not Found");
			} else {
				do {
					System.out.println(
							"1. Deposite amount\n2. Withdraw amount\n3. Check Available Balance\n4. Show data\n");
					System.out.print("Enter Your Choice : ");
					int choice = scan.nextInt();

					switch (choice) {
					case 1:
						System.out.print("Enter The Ammount To Deposite : ");
						float depositeAmount = scan.nextFloat();
						if (customers[custValidIndex].balanceDeposit(depositeAmount)) {
							System.out.println("Balance Deposited successfull");
							System.out.println("Your Balance is : " + customers[custValidIndex].getAccountBalance());
						} else {
							System.out.println("Please enter valid Amount");
						}
						break;

					case 2:
						if (customers[custValidIndex].getAccountBalance() != 0) {
							System.out.print("Enter The Ammount To Withdraw : ");
							float withdrawAmount = scan.nextFloat();
							if (customers[custValidIndex].balanceWithdrwal(withdrawAmount)) {
								System.out.println("Balance Withdrawal successfull");
								System.out.println(
										"Your Available balance is :" + customers[custValidIndex].getAccountBalance());
							} else {
								System.out.println("Balance not sufficient....");
							}

						} else {
							System.out.println("Balance not sufficient....");
						}
						break;
					case 3:
						System.out.println("Available Balance is : " + customers[custValidIndex].getAccountBalance());
						break;
					case 4:
						System.out.println("Customer Details : " + customers[custValidIndex]);
						break;
					default:
						System.out.println("\nInvalid Input please tray again");
					}

					System.out.print("\nDo You Want To Again (Y/N) : ");
					ch = scan.next().charAt(0);
				} while (ch == 'Y' || ch == 'y');
			}
			System.out.println("Tray again...(Y/N) : ");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
