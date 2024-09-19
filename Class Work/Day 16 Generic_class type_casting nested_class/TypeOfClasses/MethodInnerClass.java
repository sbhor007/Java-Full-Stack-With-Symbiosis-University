package TypeOfClassess;

class OuterClass2{
	void outerClassMethod() {
		final String str = "Inner Class Trainning";
		System.out.println("Inside Outer Class Method()");
		class InnerClass{
			public void innerClassMethod() {
				System.out.println("I am Studying JAva For " + str);
			}
		}
		InnerClass in = new InnerClass();
		in.innerClassMethod();
	}
}

public class MethodInnerClass {

	public static void main(String[] args) {
		OuterClass2 out = new OuterClass2();
		out.outerClassMethod();
	}

}
