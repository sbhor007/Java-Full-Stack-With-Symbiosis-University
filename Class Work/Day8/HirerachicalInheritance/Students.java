package HirerachicalInheritance;

public class Students extends Person {
	private String division;
	private float percentage;
	
	public Students() {
		this.division = "TYBBA-CA";
		this.percentage = 78.33f;
	}
	
	public Students(String division,float perpercentage) {
		this.division = division;
		this.percentage = perpercentage;
	}
	
	public Students(String name, String city, String division,float perpercentage) {
		super(name,city);
		this.division = division;
		this.percentage = perpercentage;
	}
	
	public void setDivision(String division) {
		this.division = division;
	}
	
	public String getDivision() {
		return this.division;
	}
	
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	public float getPercentage() {
		return this.percentage;
	}

	@Override
	public String toString() {
		return "Students [division=" + division + ", percentage=" + percentage + ", Name= " + getName() + ", City= "
				+ getCity() +"]";
	}
	
	
}
