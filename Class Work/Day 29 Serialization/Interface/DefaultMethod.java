package Interface;

/*
 * default method is a fully implemented
 * method in an interface that declared using the keyword default
 * Default method were introduced in java SE 8 to allow
 * for the extension of interfaces without breaking existing code
 */
interface MyDefaultInterface
{
	//Default method
	default void defaultPrint() {
		System.out.println("Hello This oi Default method");
	}
	//Statict method
	public static void m1() {
		System.out.println("This is static method");
	}
	
	//abstract method
	void show(String msg);
	
}

public class DefaultMethod implements MyDefaultInterface{

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.defaultPrint();
		dm.show("Calling Show");
		//Calling of static method
		MyDefaultInterface.m1();

		

	}


	@Override
	public void show(String msg) {
		System.out.println(msg);
		
	}

}
