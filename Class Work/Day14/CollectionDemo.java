package CollectionFremwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class CollectionDemo {
	static void method1() {
		ArrayList myArr = new ArrayList();
		myArr.add("1");
		myArr.add(2);
		myArr.add('c');
		myArr.add(100.25);
		
		System.out.println(myArr);
		System.out.println("-------- using for loop -------------");
		for(int i = 0; i < myArr.size();i++) {
			System.out.println(myArr.get(i));
		}
		System.out.println("--------- using forEach Loop------------");
		for(Object o : myArr) {
			System.out.println(o);
		}
		System.out.println("--------- using While with Iterator Loop------------");
		Iterator it = myArr.iterator(); // it works ony forword direction
		while(it.hasNext()) {
//			Object object = (Object) it.next();
			System.out.println((Object) it.next());
		}
		System.out.println("--------- using List Iterator Loop------------");
		System.out.println("---------Forword------------");
		ListIterator listIt = myArr.listIterator(); // it works both forword and backword direction 
		while(listIt.hasNext()) {
//			Object object = (Object) listIt.next();
			System.out.println((Object)listIt.next());
		}
		System.out.println("---------Backword------------");
		while(listIt.hasPrevious()) {
			System.out.println((Object)listIt.previous());
		}
	}
	
	static void method2() {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("ABC");
		a1.add("PQR");
		a1.add("XYZ");
		a1.add("LMN");
		System.out.println("------------");
		System.out.println(a1);
	
		System.out.println("------------");
		a1.addFirst("Test");
		System.out.println(a1);
		
		System.out.println("------------");
		a1.addLast("Test1");
		System.out.println(a1);
		
		System.out.println("------------");
		a1.add(2,"Test3");
		System.out.println(a1);
		
		System.out.println("------------");
		a1.remove(1);
		System.out.println(a1);
		System.out.println("------------");
		System.out.println("is List Empty " + a1.isEmpty());
		System.out.println("size of list " + a1.size());
		System.out.println("Fount " + a1.contains("Test1"));
		System.out.println("------------");
		Collections.sort(a1);
		System.out.println(a1);
	}
	
	static void method3() {
		LinkedList li = new LinkedList();
		li.add("AVC");
		li.add(123);
		li.add(1);
		li.add(12);
		li.add(1234);
		li.add('o');
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.get(1));
		System.out.println(li.getFirst());
		li.remove(4);
		System.out.println(li);
		System.out.println("-----------------");
		Stack<String> st = new Stack<String>();
		st.add("A");
		st.add("B");
		st.add("C");
		st.add("D");
		System.out.println(st);
		st.push("E");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		st.add(1,"Test1");
		st.push("Test3");
		System.out.println(st);
		st.remove(2);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		Object[] oarr = li.toArray();
	}
	
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
	}

}
