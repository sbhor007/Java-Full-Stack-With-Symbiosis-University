package Abstraction;

import java.lang.reflect.Constructor;

public class ObjectCreationMethod {
	String name="Santosh";
	public static void method1() {
		// Create class object using new operator
		ObjectCreationMethod obj = new ObjectCreationMethod();
		System.out.println(obj.name);
	}

	public static void method2() {
		// Create object using 
		try {
			// Create class object using newInstance method
			ObjectCreationMethod obj = ObjectCreationMethod.class.newInstance();
			System.out.println(obj.name);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	static void method3() {
		// Create class object using getConstructor method
		try {
			Constructor<ObjectCreationMethod> obj = ObjectCreationMethod.class.getConstructor();
			ObjectCreationMethod obj1 = obj.newInstance();
			System.out.println(obj1.name);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		method1();
		method2();
		method3();
	}

}
