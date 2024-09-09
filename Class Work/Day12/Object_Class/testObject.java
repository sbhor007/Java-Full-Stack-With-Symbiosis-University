package ObjectExample;


public class testObject implements Cloneable {
	String name;
	int age;

	public static void equalMethod() {
		testObject obj1 = new testObject();
		testObject obj2 = new testObject();
		int a = 10;
		int b = 11;

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		String str1 = "TEJAS";
		String str2 = "VIJAY";

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.getClass());

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str2));

		try {
			obj1.name = "ABC";
			obj1.age = 99;
			testObject obj3 = (testObject) obj1.clone();
			System.out.println(obj1.equals(obj3));
			System.out.println("object 1:" + obj1.name + " AGE " + obj1.age);
			System.out.println("object 3:" + obj3.name + " AGE " + obj3.age);

			obj3.name = "XYZ";
			obj3.age = 87;
			System.out.println(obj1.equals(obj3)); 
			System.out.println("object 3:" + obj3.name + " AGE " + obj3.age);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		equalMethod();
	}

}
