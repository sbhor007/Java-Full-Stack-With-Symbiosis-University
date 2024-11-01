package Ass23;
// find duplicate elements in a java

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements store in a array :");
		int no = scan.nextInt();
		System.out.println("Enter Array elements : ");
		for (int i = 0; i < no; i++) {
			arr.add(scan.nextInt());
		}
		Hashtable<Integer, Integer> duplicates = new Hashtable<Integer, Integer>();

		for (Integer i : arr) {
			if (duplicates.get(i) == null) {
				duplicates.put(i, 1);
			} else {
				duplicates.put(i, duplicates.get(i) + 1);
			}
		}

		Enumeration<Integer> keys = duplicates.keys();
		System.out.print("Duplicate elements : [");
		while (keys.hasMoreElements()) {
			int key = (Integer) keys.nextElement();
			int count = duplicates.get(key);
			if (count > 1) {
				System.out.print(key + ", ");
			}
		}
		System.out.println("]");
	}
}
