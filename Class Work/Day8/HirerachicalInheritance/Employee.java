package HirerachicalInheritance;

public class Employee extends Person {
	private int empID;
	private float salary;
	private String department;

	public Employee() {
		this.empID = 1001;
		this.salary = 2555f;
		this.department = "IT";
	}

	public Employee(int empID, float salary, String department) {
		this.empID = empID;
		this.salary = salary;
		this.department = department;
	}

	public Employee(String name, String city, int empID, float salary, String department) {
		super(name, city);
		this.empID = empID;
		this.salary = salary;
		this.department = department;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", salary=" + salary + ", department=" + department + ", getName()="
				+ getName() + ", getCity()=" + getCity() + "]";
	}

}
