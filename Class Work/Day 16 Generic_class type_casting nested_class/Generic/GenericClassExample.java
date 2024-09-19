package Genaric;

public class GenericClassExample {

	public static void main(String[] args) {
		GenericClass<String> sobj = new GenericClass<String>();
		sobj.set("Santosh");
		System.out.println("Hi " + sobj.get());
		
		GenericClass<Integer> iobj = new GenericClass<Integer>();
		iobj.set(11);
		System.out.println("Value is " + iobj.get());
		
//		GenericClass<T>
		
	}

}
