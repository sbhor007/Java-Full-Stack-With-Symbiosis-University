package ThreadDemo;

class MyThread extends Thread{
	public MyThread() {
		super();
	}
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + " - i = " + i);
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread("Child2 ");
		System.out.println("M1 Thread initial name and priority");
		System.out.println("m1 name : " + m1.getName());
		System.out.println("m1 Priority : " + m1.getPriority());
		System.out.println();
		System.out.println("M2 Thread initial name and priority");
		System.out.println("m2 name : " + m2.getName());
		System.out.println("m2 Priority : " + m2.getPriority());
		System.out.println();
		m1.setName("child1 ");
		m1.setPriority(6);
		m2.setPriority(9);
		System.out.println("M1 Thread initial name and priority");
		System.out.println("m1 name : " + m1.getName());
		System.out.println("m1 Priority : " + m1.getPriority());
		System.out.println();
		System.out.println("M2 Thread initial name and priority");
		System.out.println("m2 name : " + m2.getName());
		System.out.println("m2 Priority : " + m2.getPriority());
		System.out.println();
		
		m1.start();
		m2.start();
		for(int i = 0; i < 5;i++) {
			System.out.println("Main i : " + i);
		}
	}

}
