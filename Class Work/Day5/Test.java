import java.util.Scanner;

public class Test {
	
	public static void demo(){
		String[] cities = {"Nashik","pune","Mumbai"};
		for(String city : cities)
		{
			System.out.println(city);
		}
	}
	
	public static void cityDemo() {
		Scanner scan = new Scanner(System.in);
		String[] cities = new String[6];
		System.out.println("Enter The 6 City Name : ");
		for(int i = 0; i < cities.length;i++) {
			System.out.print("City - " + (i+1) + " : ");
			cities[i] = scan.next();
		}
		System.out.println("You Enterd Cities");
		for(String city : cities) {
			System.out.println(city);
		}
	}

	public static void stateCities() {
		String[][] state = new String[3][4];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the State and Cities : ");
		for(int i = 0; i < state.length;i++)
		{
			System.out.print("Enter The State : ");
			state[i][0] = scan.next();
			System.out.println("Enter The 3 citys : ");
			
			for(int j = 1;j < state[i].length;j++)
			{
				state[i][j] = scan.next();
			}
		}
		
		System.out.println("\nState and Cities : ");
		for(String states[] : state) {
			for(String city : states)
			{
				System.out.print(city + " - ");
			}
			System.out.println();
		}
	}
	
	public static void jagdArray() {
		
		int[][] number = new int[3][];
		number[0] = new int[] {1,2,3};
		number[1] = new int[] {7,9};
		number[2] = new int[] {9,8,7,6,5,};
		
		for(int i = 0; i < number.length;i++)
		{
			for(int j = 0; j < number[i].length;j++)
			{
				System.out.print(number[i][j] + "\t");
			}
			System.out.println();
		}
 	}
	
	public static void jagdArrayWithString() {
		Scanner scan = new Scanner(System.in);
		
		String[][] classSubject = new String[3][];
		
		for(int i = 0; i < classSubject.length;i++)
		{
			
			System.out.println("Enter Your Class : ");
			String className = scan.next();
			
			System.out.print("Number of Subject  : ");
			int sub = scan.nextInt();
			
			classSubject[i] = new String[sub+1];
			
			classSubject[i][0] = className;
			System.out.println("Enter Your Subjects : ");
			
			for(int j = 1;j < classSubject[i].length;j++)
			{
				classSubject[i][j] = scan.next();
			}
			System.out.println("\n-----------------------------");
		}
		
		System.out.println("Class and Subjects:");
		for(String studClass[] : classSubject)
		{
			for(String subject : studClass)
			{
				System.out.print(subject + " ");
			}
			System.out.println();
		}
	}
	
	public static void jagdArrayWithCities() {
		Scanner scan = new Scanner(System.in);
		
		String[][] stateCity = new String[3][];
		
		for(int i = 0; i < stateCity.length;i++)
		{
			
			System.out.println("Enter Your State : ");
			String stateName = scan.next();
			
			System.out.print("Number of Cities  : ");
			int sub = scan.nextInt();
			
			stateCity[i] = new String[sub+1];
			
			stateCity[i][0] = stateName;
			System.out.println("Enter City Names : ");
			
			for(int j = 1;j < stateCity[i].length;j++)
			{
				stateCity[i][j] = scan.next();
			}
			System.out.println("\n-----------------------------");
		}
		
		System.out.println("state and Citys :");
		for(String states[] : stateCity)
		{
			for(String city : states)
			{
				System.out.print(city + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		demo();
//		cityDemo();
//		stateCities();
//		jagdArray();
//		jagdArrayWithString();
		jagdArrayWithCities();
	}

}
