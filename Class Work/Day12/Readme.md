# Abstraction
  - Abstraction hides implementation to the system
  - Abstract classes provides non implemented abstract method
  - do not create it's object
  - it contains bot abstract and non abstract methods
  - Abstract methods always `public`
  - 
  - Syntax
```java
//Syntax
abstract class classname{
  //......
}

// e.g

```


# Override
  - Overriding is a under `IS-A` relationship
  - It Dynamic Polymorphism

# Object Class
  - Object clss is a `parent` class of all classes
  - in implicitly include of any class creation
  - it implementation like
  - `class ClassName extends Object{}` but there is implicitly

# Object Methods
  - toString() method is a Object class method
  - equals()
      - equals() method are use to compare(equal) two objects
      - it do not worked premitive data types
      - it `object` compare based on there ` id / hashCode `
  - hashCode()
      - in his method used to get hash code of an object
  - getClass()
      - it return className of there particular Object
  - clone()
      - it worked as copy one object to another object

# Object Createtion 
  - Three ways to create Object
        1) using `new` operator
        2) using `newInstance` method
        3) using `getConstructor` method
```java
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
```
