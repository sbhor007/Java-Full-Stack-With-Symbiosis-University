// Calculate area of rectangle

import java.util.Scanner;

public class Rectangle {
	static float areaOfRectangle(float length, float width) {
		return length * width;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float length, width;
		System.out.print("Enter the LENGTH of Rectangle : ");
		length = scan.nextFloat();
		System.out.print("Enter the WIDTH of Rectangle : ");
		width = scan.nextFloat();

		System.out.println("\nArea of Rectangle is : " + areaOfRectangle(length, width));
	}

}
