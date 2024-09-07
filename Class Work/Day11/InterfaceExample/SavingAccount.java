package InterfaceExample;

public class SavingAccount extends Person implements Bank{
	
	
	private String accountNo;
	private float accountBalance;
	public SavingAccount(String accountNo, float openingBal ,String name, String city) {
		super(name, city);
		this.accountNo = accountNo;
		this.accountBalance = openingBal;
		System.out.println("Account Created Successfully");
	}

	@Override
	public void Deposit(float amount) {
		if(amount > 0) {
			accountBalance += amount;
			System.out.println("Amount Deposited Successfully");
		}else {
			System.out.println("Transaction Fail");
			System.out.println("Due To Invalid Amount");s
		}
	}

	@Override
	public void withdraw(float amount) {
		if(amount > 0) {
		if(amount <= this.accountBalance) {
			if(limit >=  amount) {
				if(minBalance <= (this.accountBalance - amount)) {
					this.accountBalance -= amount;
					System.out.println("Amount Withdrawal  Successfully");
				}else {
					System.out.println("Transaction Fail....");
					System.out.println("Maintain Your account Balance At List  " + minBalance );
				}
				
			}else {
				System.out.println("Transaction Fail....");
				System.out.println("Due to You Cant withdraw more than " + limit + " at a aime");
			}
		}
		else {
			System.out.println("Transaction Fail....");
			System.out.println("Due to unsufisient balance...");
		}
		}else {
			System.out.println("Transaction Fail");
			System.out.println("Due To Invalid Amount");
		}
	}

	public String getAccountNo() {
		return accountNo;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount ["
				+ "\nAccount Holder : " + getName() 
				+ "\nCity : " + getCity()
				+ "\naccount No : " + accountNo 
				+ "\nAccount Balance : " + accountBalance 
				+ "\n]";
	}
	
	

}
