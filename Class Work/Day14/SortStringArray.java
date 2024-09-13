package CollectionFremwork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortStringArray {
	
	static void strArr() {
		Scanner scan = new Scanner(System.in);
		
		String[] city = new String[5];
		System.out.println("Enter a Five Sities : ");
		for(int i = 0;i < city.length ;i++) {
			city[i] = scan.next();
		}
		
		Arrays.sort(city);
		for(String c : city) {
			System.out.println(c);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strArr();

	}

}
