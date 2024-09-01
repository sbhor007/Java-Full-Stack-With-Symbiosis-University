import java.util.Scanner;

public class Test {
	
	public static void sbExample() {
		int[] marks = new int[5]; //declaring an array with size 5
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		int[] rollNo = new int[] {1,2,3,4}; // declaring an array with initialize values
		System.out.println("----MARKS----");
		for(int i = 0; i < marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("----ROLL NO-----");
		for(int i = 0; i < rollNo.length;i++) {
			System.out.println(rollNo[i]);
		}
		
	}
	
	public static void sbExample1() {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.println("Enter The Five Subject Marks : ");
		for(int i = 0; i < marks.length;i++) {
			System.out.print("Subject - " + (i+1) + " : ");
			marks[i] = scan.nextInt();
		}
		
		System.out.println("Student Marks");
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

	public static void sbExample2() {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		int sum = 0;
		System.out.println("Enter The Five Subject Marks : ");
		for(int i = 0; i < marks.length;i++) {
			System.out.print("Subject - " + (i+1) + " : ");
			marks[i] = scan.nextInt();
			sum += marks[i];
		}
		
//		for(int i = 0; i < marks.length; i++) {
//			sum += marks[i];
//		}
		System.out.println("Total Marks : " + sum);
	}
	
	public static void bubbleSort() {
		int[] rollNo = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 10 Roll Number");
		for(int i = 0; i < rollNo.length;i++) {
			rollNo[i] = scan.nextInt();	
		}
		
		System.out.println("Befor Sorting");
		for(int i = 0; i < rollNo.length;i++) {
			System.out.println(rollNo[i]);
		}
		
		//sorting
		
		for(int i = 0; i < rollNo.length - 1;i++) {
			for(int j = 0; j < rollNo.length - i -1;j++) {
				if(rollNo[j] > rollNo[j+1])
				{
					int temp = rollNo[j];
					rollNo[j] = rollNo[j+1];
					rollNo[j+1] = temp;
				}
			}
		}
		
		System.out.println("after Sorting");
		for(int i = 0; i < rollNo.length;i++) {
			System.out.println(rollNo[i]);
		}
		
		
	}
	
	public static void findMaxMin() {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		int max = 0,min;
		
		System.out.println("Enter Ther 5 subject marks");
		for(int i = 0; i < marks.length;i++) {
			marks[i] = scan.nextInt();		}
		for(int i = 0; i < marks.length;i++) {
			if(max < marks[i])
				max = marks[i];
		}
		
		min = marks[0];
		for(int i =0; i < marks.length;i++) {
			if(min > marks[i])
				min = marks[i];		
		}
		System.out.println("Max : " + max + "\nMin : " + min);
		
		
	}
	
	public static void forEachExample() {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		
		System.out.println("Enter Ther 5 subject marks");
		for(int i = 0; i < marks.length;i++) {
			marks[i] = scan.nextInt();	
		}
		for(int i : marks) {
			System.out.println(i);
		}
	}

	public static void twoDArray() {
		Scanner scan = new Scanner(System.in);
		int[][] nums = new int[3][2];
		System.out.println("Enter the 6 numbers");
		for(int i = 0; i < nums.length;i++) {
			for(int j = 0; j < nums[i].length;j++) {
				nums[i][j] = scan.nextInt();
			}
		}
		System.out.println("You entered numbers numbers");
		for(int i[] : nums) {
			for(int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
	
	public static void addtionOfTwoDArray() {
		Scanner scan = new Scanner(System.in);
		int[][] nums = new int[3][2];
		int sum = 0;
		System.out.println("Enter the 6 numbers");
		for(int i = 0; i < nums.length;i++) {
			for(int j = 0; j < nums[i].length;j++) {
				nums[i][j] = scan.nextInt();
				sum += nums[i][j];
			}
		}
		
		System.out.println("Addition of two dimentional array elements : " + sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test.sbExample();
//		Test.sbExample1();
//		Test.sbExample2();
		//bubbleSort();
		
		/*Sorting sort = new Sorting();
		int[] rollNo = new int[10];
		System.out.println("Enter the 10 Student Roll Number");
		sort.getArrayElements(rollNo);
		System.out.println("Befor Sorting");
		sort.displayArrya(rollNo);
		sort.bubbleSort(rollNo);
		System.out.println("after Sorting");
		sort.displayArrya(rollNo);*/
		
//		findMaxMin();
		
//		forEachExample();
		
//		twoDArray();
		
		addtionOfTwoDArray();
		

	}

}

class Sorting
{
	Scanner scan = new Scanner(System.in);
	public void displayArrya(int [] arr) {
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1;i++) {
			for(int j = 0; j < arr.length - i -1;j++) {
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void getArrayElements(int arr[]) {
		for(int i = 0; i < arr.length;i++) {
			arr[i] = scan.nextInt();	
		}
	}
}


