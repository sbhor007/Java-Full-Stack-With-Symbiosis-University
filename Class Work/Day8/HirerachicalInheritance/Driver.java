package HirerachicalInheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println("----Persons Details--------");
		System.out.println(p1);
		Person p;
		p = new Person("Harshal", "Latur");

		if (p instanceof Person) // dentify object belong to class
		{
			System.out.println("Person Details : \n" + p);
		}

		p = new Employee("Harshal", "Dhule", 1001, 50005f, "IT");// daynamic allocation of memory to the chield class

		if (p instanceof Employee) // dentify object belong to class

		{
			System.out.println("Employee Details : \n" + p);
		}

		p = new Students("A", 78.33f);

		if (p instanceof Students) // dentify object belong to class
		{
			System.out.println("Student Details : \n" + p);
		}

		p = new Students("Santosh", "Nashik", "A", 78.33f);

		if (p instanceof Students) // dentify object belong to class
		{
			System.out.println("Student Details : \n" + p);
		}

	}

}
