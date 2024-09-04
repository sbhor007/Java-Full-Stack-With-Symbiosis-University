package HirerachicalInheritance;

public class Person {
	private String name,city;
	public Person() {
		this.name = "Santosh";
		this.city = "Nashik";
	}
	
	public Person(String name,String city) {
		this.name = name;
		this.city = city;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
	
}

