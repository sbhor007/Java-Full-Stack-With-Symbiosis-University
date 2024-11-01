package Ass25;


import java.util.Scanner;

//Find the Minimum and Maximum Element with their Index Number from Given Array
public class FindMaxAndMin {
	
	static int[] findMax(int[] arr) {
		int[] maxWithIndex = new int[2];
		int max = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxWithIndex[0] = arr[i];
				maxWithIndex[1] = i;
			}
		}
		return maxWithIndex;	
	}
	
	static int[] findMmin(int[] arr) {
		int[] minWithIndex = new int[2];
		int min = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
				minWithIndex[0] = arr[i];
				minWithIndex[1] = i;
			}
		}
		return minWithIndex;	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements in a array : ");
		int no = scan.nextInt();
		int[] arr = new int[no];
		for(int i = 0; i < no;i++) {
			arr[i] = (scan.nextInt());
		}
		
		int[] maxWithIndex = findMax(arr);
		System.out.println("Maximum element in a array is " + maxWithIndex[0] + " and it prient  " + maxWithIndex[1] + " index");
		int[] minWithIndex = findMmin(arr);
		System.out.println("Minimum element in a array is " + minWithIndex[0] + " and it prient  " + minWithIndex[1] + " index");
//		

	}

}
