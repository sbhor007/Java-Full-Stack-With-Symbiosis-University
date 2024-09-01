
public class Test {

	public static void main(String[] args) {
		MyClass m = new MyClass();
//		System.out.println("A : " + m.a);
//		System.out.println("B : " + m.b);
		MyClass.Example(8, 10);
		m.method2(m);
		m.show();	
	}

}

class MyClass
{
	int a,b;
	public MyClass() {
		a = 10;
		b = 20;
		System.out.println("Value of A : " + a);
		System.out.println("Value of B : " + b);
	}
	public MyClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void Example(int x,int y) {
		++x;
		y++;
		System.out.println("X : " + x + "\nY : " + y);
	}
	public void method2(MyClass obj) {
		obj.a *=10;
		obj.b *= 10;
	}
	
	 public void show() {
		System.out.println("Value of A : " + a);
		System.out.println("Value of B : " + b);
	}
}
