package ThreadDemo;

public class ThreadExample3 extends Thread {
	Thread t;
	public ThreadExample3() {
		t = new Thread(this);
		System.out.println("T is Born");
		System.out.println("T is Ready");
		t.start();
	}
	
	public void run() {
		System.out.println("T is Running");
		m1();
	}
	
	public void m1() {
		System.out.println("Method 1");
	}
	public static void main(String[] args) {
		new ThreadExample3();

	}

}
