package haAInheritance;

//Assosiation HA-A

class Person1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Address1 {
	private String state;
	private String city;
	private String zip;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}

public class BirectionalManyToMany {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("Santosh");
		Address1 addr = new Address1();
		addr.setCity("Nashik");
		addr.setState("Maharashtra");
		addr.setZip("422203");
		
		Person p2 = new Person();
		p2.setName("Santosh");
		Address1 addr2 = new Address1();
		addr2.setCity("Pune");
		addr2.setState("Maharashtra");
		addr2.setZip("422203");

		System.out.println(p1.getName() + " Lives at address " + addr.getCity() + ", "
				+ addr.getState() + ", " + addr.getZip());
		System.out.println(p2.getName() + " Lives at address " + addr2.getCity() + ", "
				+ addr2.getState() + ", " + addr2.getZip() + "\nBut she has also Address at " + addr.getCity() + ", "
				+ addr.getState() + ", " + addr.getZip());

	}

}
