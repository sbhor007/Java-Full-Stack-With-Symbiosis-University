package haAInheritance;

//HS-A aggrigation

class SimCard{
	private String cardNo;
	public SimCard() {
		System.out.println("Simcard Obj Constructed");
		cardNo = "New Sime Constructed";
	}
	@Override
	public String toString() {
		return "SimCard [cardNo=" + cardNo + "]";
	}
	
}

class Mobile{
	private SimCard mySim = new SimCard();
	private String MobileName = "Samsung";
	private int  modelNo = 1234;
	@Override
	public String toString() {
		return mySim + " For " + MobileName + " " + modelNo;
	}
	
	
}

public class MobileApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m = new Mobile();
		System.out.println(m);

	}

}
