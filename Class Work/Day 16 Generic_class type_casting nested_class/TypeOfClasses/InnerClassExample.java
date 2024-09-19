
package TypeOfClassess;

import TypeOfClassess.OuterClass.InnerClass;

class OuterClass{
	public class InnerClass{
		//static
		private static void print() {
			System.out.println("Inner Class Print()");
		}
		public void show() {
			OuterClass oobj = new OuterClass();
			oobj.test();
		}
		
		
	}
	public void test() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
}

public class InnerClassExample {

	public static void main(String[] args) {
		OuterClass.InnerClass outIn = new OuterClass().new InnerClass();
//		InnerClass iobj = new InnerClass();
//		outIn.print();
		
		OuterClass obj = new OuterClass();
		obj.test();
	}

}
