
public interface Bank {
	public double minBalance = 1000;
	public double rateOfIntrest = 7.5;
	public double dipositedLimit = 25000;
	
	public void dipositr(Account account,double amount);
	public void withdraw(Account account,double amount);
}
