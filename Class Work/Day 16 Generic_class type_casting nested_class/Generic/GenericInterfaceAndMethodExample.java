package Genaric;

import java.util.ArrayList;

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

class MinMaxImplement<T extends Comparable<T>> implements MinMax {

	T[] value;

	public MinMaxImplement(T[] obj) {
		value = obj;
	}

	@Override
	public T min() {
		T o1 = value[0];
		for (int i = 0; i < value.length; i++) {
			if (value[i].compareTo(o1) < 0)
				o1 = value[i];
		}

		return o1;
	}

	@Override
	public T max() {
		T o1 = value[0];
		for (int i = 0; i < value.length; i++) {
			if (value[i].compareTo(o1) > 0)
				o1 = value[i];
		}
		return o1;
	}

}

class Person implements Comparable<Person> {

	private String name, city;
	private int age;

	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [\n" + "name : " + name + "\ncity : " + city + "\nage : " + age + "\n]";
	}

	@Override
	public int compareTo(Person o) {
		if (age == o.age)
			return 0;
		else if (age > o.age)
			return 1;
		else
			return -1;
	}

}

public class GenericInterfaceAndMethodExample {

	public static void main(String[] args) {
	//	ClassName
		System.out.println("--------Float----------");
		Float[] arr = {
				2.22f,55.3f,50.5f,48.2f,2.3f
		}; 
		MinMaxImplement<Float> FloatMaxMin = new MinMaxImplement<Float>(arr);
		System.out.println("Min : " + FloatMaxMin.min());
		System.out.println("Max : " + FloatMaxMin.max());
		System.out.println("\n--------String----------");
		String [] strArr = {
				"Santosh",
				"Harshal",
				"Tejas",
				"Vijay",
				"Durgesh"
		};
		
		MinMaxImplement<String> StringMinMax = new MinMaxImplement<String>(strArr);
		System.out.println("Min : " + StringMinMax.min());
		System.out.println("Max : " + StringMinMax.max());
		System.out.println("\n--------Person----------");
		
		Person[] p = {
				new Person("Santosh", "Nashik", 21),
				new Person("Harshal", "Jalgaov", 20),
				new Person("Dipak", "Nashik", 22),
				new Person("Durgesh", "Chalisgaon", 20),
				};
		MinMaxImplement<Person> PersonMaxMin = new MinMaxImplement<Person>(p);
		System.out.println("Min age is " + PersonMaxMin.min());
		System.out.println("Max age is " + PersonMaxMin.max());
		
		
	}

}
