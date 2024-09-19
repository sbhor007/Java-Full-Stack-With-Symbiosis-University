package TypeOfClassess;

import java.lang.classfile.attribute.CharacterRangeInfo;
import java.lang.classfile.attribute.CharacterRangeTableAttribute;

public class TypeCastExample {
	
	public static void wrapDemo2(){
		char ch = 'a';
		Character charObje = new Character(ch); // wrapping char type value into Character Object
		
		byte a = 10;
		byte byteObj = new Byte(a); // wrapping byte type value into Byte Object
		
		int b = 10;
		int intObj = new Integer(b); // wrapping int type value into Integer Object
		
		float c = 108.2f;
		float floatObj = new Float(c); // wrapping float type value into Float Object
		
		double d = 205.5;
		double doubleObj = new Double(d); // wrapping double type value into Double Object
		
		// Display Wrapper Class objects
		System.out.println("Display Wrapper Class objects");
		System.out.println("Cahracter Obj : " + charObje);
		System.out.println("Byte Obj : " + byteObj);
		System.out.println("Integer Obj : " + intObj);
		System.out.println("Float Obj : " + floatObj);
		System.out.println("Double Obj : " + doubleObj);
		
		// Retrieving primitive data type values into Objects
		// unwrapping Object to primitive data types values
		char chr = charObje;
		byte by = byteObj;
		int in = intObj;
		float fl = floatObj;
		double db = doubleObj;
		
		// Displaying the value of data type
		System.out.println("\nDisplaying unwrapperd values");
		System.out.println("char val : " + chr);
		System.out.println("byte val : " + by);
		System.out.println("int val : " + in);
		System.out.println("float val : " + fl);
		System.out.println("double val : " + db);
		
		double dval;
		int intVal = 10;
		dval = intVal; // implicit type Casting
		intVal = (int)dval; //Explicit type Casting
	}
	
	public static void wrapDemo() {
		// primitive type
		int i = 20;
		// Reference type
		//(Explicit Declaration of the primitive to reference object)
		Integer iref = new Integer(i);
		// boxing(Changing primitive to reference variable)
		System.out.println(iref);
		//unboxing(feching primitive out of reference variablr
		int j = iref.intValue();
		System.out.println(j);
		
		int k = 40;
		// (implicit declaration of primitive to reference object
		Integer kref = k;	// boxing
		System.out.println(kref);
		int k1 = kref.intValue();
		System.out.println(k1); 	//unboxing
		
		// character case
		//explicit conversion of char primitive to reference object
		char ch = 'D';
		Character cref = new Character(ch); // boxing
		System.out.println(cref);
		
		/*
		 char ch1 = cref.charValue();    // unboxing
		System.out.println(ch1);
		 */
		
		char c = 'S';
		Character ccref = c;
		System.out.println(ccref);
//		char cc1 = ccref.charValue();
//		System.out.println(cc1);
		
		
		
	}
	
	static void method5() {
		Integer aObj = Integer.valueOf(23);
		Double bObj = Double.valueOf(5.55);
		
		// Convert Into Primitive types
		int a = aObj.intValue();
		double b = bObj.doubleValue();
		
		System.out.println("The Value Of a : " + a);
		System.out.println("The Value Of b : " + b);
	}
	
	static void method4() {
		// instance of operator to check whether
		//the generated objects are of Integer of Double type are not
		int a = 5;
		double b = 5.23;
		
		//Convert into wrapper objects
		Integer aObj = Integer.valueOf(a);
		Double bObj = Double.valueOf(b);
		
		if(aObj instanceof Integer) {
			System.out.println(" Object Of Integer");
		}
		
		if(bObj instanceof Double) {
			System.out.println(" Object Of Integer");
		}
	}

	static void method3() {
		int num = 10;
		System.out.println("The Integer Value is : " + num);
		
		//Convert int to String Type
		String data = String.valueOf(num);
		System.out.println("The String Value is : " + data);
		
		/*
		String data = "10";
		System.out.println("The String Value is : " + data);
		
		//convert String var To int
		int num = Integer.parseInt(data);
		System.out.println("The Integer Value is : " + num);
		*/
	}
	static void method2() {
		//Explicit type Casting
		double num = 10.90;
		System.out.println("The Integer Value is : " + num);
		
		//convert into int type
		int data = (int)num;
		System.out.println("The String Value is : " + data);
		
	}
	
	static void method1() {
		//Implicit type casting or Widening type Casting
		int num = 10;
		System.out.println("The Integer Value is : " + num);
		
		// convert into double typr
		double data = num;
		System.out.println("The String Value is : " + data);
	}
	public static void main(String[] args) {
		wrapDemo2();
		wrapDemo();
		method1();
		method2();
		method3();
		method4();
		method5();
	}
}
