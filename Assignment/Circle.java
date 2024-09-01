// Calculate circumference of circle

import java.util.Scanner;

public class Circle {
	final float PI = 3.14f;
	public float circumferenceOfCircle(float radius) {
		return (2 * PI * radius);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c = new Circle();
		System.out.print("Enter Radius of a Circle : ");
		float radius = scan.nextFloat();
		
		System.out.println("\ncircumference of circle : " + c.circumferenceOfCircle(radius));

	}

}
