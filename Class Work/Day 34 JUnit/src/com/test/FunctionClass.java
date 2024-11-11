package com.test;

public class FunctionClass {
	public static int m1(int no) {
		//TODO: find the factorial of given parameter
		int factorial = 1;
		for(int i = 1;i <=no; i ++)
		{
			factorial *= i;
		}
		
		return factorial;
		
	}
	
	public static int m2(int no) {
		//TODO: check the given no is palindrome or not
		int temp = no;
		int rev = 0;
		while(no != 0) {
			rev = (rev * 10) + no % 10;
			no = (int)no/10; 
		}
		if(temp == rev) {
			return 1;
		}else {
			return -1;
		}
		
	}
}
