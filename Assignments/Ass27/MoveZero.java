package Ass27;

import java.util.Scanner;

/*
 * Given an Integer Array, Find the Value Zero and Move it to 
 * the End of the Array While Maintaining the Relative Order of 
 * Non-Zero Elements Example: Input: (1,0,2,0,3), Output: 1,2,3,0,0
 */
public class MoveZero {
	public static void moveZero(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			while(arr[start] != 0) {
				start++;
			}
			while(arr[end] == 0) {
				end--;
			}
			if(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		}

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements in a array : ");
		int no = scan.nextInt();
		int[] arr = new int[no];
		System.out.println(arr.length);
		System.out.println("Enter a array elements : ");
		for(int i = 0; i < arr.length;i++) {
			arr[i] = scan.nextInt();
			
		}
		moveZero(arr);
		System.out.print("[");
		for(int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.print("]");
		
	}

}
