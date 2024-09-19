package Genaric;

class GenericConstructor
{
	private double v;
	public <T extends Number> GenericConstructor(T t){
		this.v = t.doubleValue();
	}
	
	void show() {
		System.out.println("VAlue of V double type is : " + v);
	}
}

public class GenericConstructorExample {

	public static void main(String[] args) {
		GenericConstructor obj = new GenericConstructor(10);
		obj.show();

	}

}
