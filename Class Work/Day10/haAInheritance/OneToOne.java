package haAInheritance;
//composition

class Person{
	private String name;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Passport{
	private int passportNo;

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	
}


public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.setName("Santosh");
		
		Person p2 = new Person();
		p2.setName("Harshal");
		
		Passport pp1 = new Passport();
		pp1.setPassportNo(123345);
		
		Passport pp2 = new Passport();
		pp2.setPassportNo(12345);
		
		System.out.println(p1.getName() + " has a US passport whose passport no is :  " + pp1.getPassportNo());
		System.out.println(p2.getName() + " has a INDIAN passport whose passport no is :  " + pp2.getPassportNo());

	}

}
