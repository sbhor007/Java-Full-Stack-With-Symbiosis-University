
public class BankImplement implements Bank {

	@Override
	public void dipositr(Account account, double amount) {
		if (amount > dipositedLimit) {
			System.out.println("Deposite limit extends");
		} else {
			account.setBalance(account.getBalance() + amount);
			System.out.println("deposited " + amount + " into Account " + account.getAccNo());
		}
	}

	@Override
	public void withdraw(Account account, double amount) {
		if(account.getBalance() - amount >= minBalance) {
			account.setBalance(account.getBalance() - amount);
			System.out.println("Withdrawn : " + amount + " From Account : " + account.getAccNo());
		}
	}

}
