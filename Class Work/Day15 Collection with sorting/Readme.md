# Object sorting
  - Thre are 2 interface are use to sort objects
  - **1) comparable**
  - **2) comparator**

## comparable interface
```java
// comparable interface
class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private float empSalary;
	
	@Override
	public int compareTo(Employee e) {
		return empName.compareTo(e.empName);
	}
}

public class EmployeesList {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee(empId, empName, empSalary));
    Collections.sort(employees); //sorting with comparable interface


```

```java
class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student \n[\nrollNo : " + rollNo + "\nname : " + name + "\nage : " + age + "\n]";
	}
}

class studentRollNoComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.rollNo == o2.rollNo)
			return 0;
		else if (o1.rollNo > o2.rollNo)
			return 1;
		else
			return -1;
	}
}

class studentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class ComparatorSortingExample {
  public static void main(String[] args) {
      ArrayList<Student> students = new ArrayList<Student>();
      students.add(new Student(rollNo, name, age));
      // sorting with comparator interface
      Collections.sort(students, new studentRollNoComparator());
      Collections.sort(students, new studentNameComparator());
  }
}

```
