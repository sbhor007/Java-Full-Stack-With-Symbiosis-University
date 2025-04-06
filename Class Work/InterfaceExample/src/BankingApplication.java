
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new BankImplement();
		Account account = new Account(123, "abc", 3000, bank);
		
		account.deposite(10000);
		System.out.println(account);
		System.out.println("After withdrawal");
		account.withdraw(2000);
		System.out.println(account);
	}

}
