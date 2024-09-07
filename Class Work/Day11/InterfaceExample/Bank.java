package InterfaceExample;

public interface Bank {
	int minBalance = 5000, limit = 25000;
	public void Deposit(float amount);
	public void withdraw(float amount);
}
