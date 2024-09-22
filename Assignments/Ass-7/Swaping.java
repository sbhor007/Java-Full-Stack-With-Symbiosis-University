//Swap two numbers using call by value and call by reference

import java.util.Scanner;

public class Swaping {

	static void swapWithCallByReference(Test obj) {
		obj.no1 = obj.no1 + obj.no2;
		obj.no2 = obj.no1 - obj.no2;
		obj.no1 = obj.no1 - obj.no2;
	}

	static void swapWithCallByVAlue(int no1, int no2) {
		no1 = no1 + no2;
		no2 = no1 - no2;
		no1 = no1 - no2;
		System.out.println("Swap [no1=" + no1 + ", no2=" + no2 + "]");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no1, no2;
		System.out.print("Enter A First Number : ");
		no1 = scan.nextInt();
		System.out.print("Enter A Second Number : ");
		no2 = scan.nextInt();

		System.out.println("\nSwap two numbers with call by Reference : ");
		swapWithCallByVAlue(no1, no2);

		System.out.println("Swap two numbers with call by value : ");
		Test t = new Test(no1, no2);
		swapWithCallByReference(t);
		System.out.println(t);

	}
}
class Test
{
	int no1,no2;
	public Test(int no1,int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	@Override
	public String toString() {
		return "Test [no1=" + no1 + ", no2=" + no2 + "]";
	}
	
	
}