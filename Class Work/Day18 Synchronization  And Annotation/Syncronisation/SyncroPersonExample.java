package Syncronisation;

class Person{
	synchronized
	public void displayName(String name) {
		for(int i = 0;i < 5;i++) {
			System.out.println(name);
		}
	}
}

class Student extends Thread{
	Person p;
	String name;
	public Student(Person p, String name) {
		super();
		this.p = p;
		this.name = name;
	}
	
	public void run() {
		p.displayName(name);
	}
	
}

public class SyncroPersonExample {

	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student(p, "Santosh");
		Student s1 = new Student(p, "Harshal");
		
		s.start();
		s1.start();

	}

}
