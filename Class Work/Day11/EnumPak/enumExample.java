package EnumPak;


enum days{
	SUNDAT(1),MONDAY(2),TUESDAY(3);
	int MYNO;
	private days(int MYNO) {
		this.MYNO = MYNO;
	}
	public int getMYNO() {
		return MYNO;
	}
	
	
}

enum Tvs{
	SonyTV(50000),LgTV(60000),SamsungTv(55000);
	int price;
	private Tvs(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	
}

public class enumExample {
	
	private int no;
	public String name;
	public void show() {
		days mydays[] = days.values();
		for(days dd : mydays) {
			System.out.println(dd);
		}
		for(days dd : days.values()) {
			System.out.println(dd.ordinal());
		}
	}
	
	public void showTv() {
		Tvs myTvs[] = Tvs.values();
		for(Tvs tv : myTvs) {
			System.out.println("Price of  " +  tv + " is : " + tv.getPrice());
		}
	}

	public static void main(String[] args) {
		System.out.println("Enum example");
		
		enumExample obj = new enumExample();
		obj.show();
		days d = days.MONDAY;
		System.out.println(d);
		obj.showTv();

	}

}
