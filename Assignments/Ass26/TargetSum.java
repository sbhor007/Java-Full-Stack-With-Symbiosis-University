package Ass26;

import java.util.Scanner;

//Given an Array of Integers and One Integer Value as Target Sum, Return the Indexes of Two Elements that Add Up to the Target Value
public class TargetSum {
	static int[] findTargeSum(int[] arr,int targetSum) {
		int[] indexes = new int[]{-1,-1};
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1; j <arr.length;j++)
			{
				if((arr[i] + arr[j]) == targetSum) {
					indexes[0] = i;
					indexes[1] = j;
					 return indexes;
				}
			}
		}
		
		return indexes;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How Many Element In a Array : ");
		int no = scan.nextInt();
		int[] arr = new int[no];
		for(int i = 0; i < arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Enter The Targe sum : ");
		int targetSum = scan.nextInt();
		int[] indexes = findTargeSum(arr, targetSum);
		if(indexes[0] == -1) {
			System.out.println("Target sum not present");
		}else {
			System.out.println("Target sum Indexex [" + indexes[0] + " , " + indexes[1] + "]");
		}

	}

}
