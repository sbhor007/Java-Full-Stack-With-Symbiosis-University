// calculate power of a number
public class PowerOfNumber {
	int num,pow;
	public PowerOfNumber(int num,int pow) {
		this.num = num;
		this.pow = pow;
	}
	
	
	public int calculatePower() {
		int power = 1;
		for(int i = 1;i <= pow;i++)
		{
			power = power * num;
		}
		return power;
	}
	public static void main(String[] args) {
		PowerOfNumber p = new PowerOfNumber(3, 3);
		System.out.println(p.calculatePower());

	}

}
