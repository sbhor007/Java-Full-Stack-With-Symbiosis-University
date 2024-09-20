package ThreadDemo;

public class ThreadingWithClass extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Thread t1 = new ThreadingWithClass();
		t1.setName("Child thread 1");
		t1.setPriority(8);
		t1.start();
		
		ThreadingWithClass obj1 = new ThreadingWithClass();
		obj1.setPriority(MAX_PRIORITY);
		obj1.start();
		System.out.println(t1.currentThread().getName());
		System.out.println(t1.currentThread().getPriority());
		
		ThreadingWithClass obj2 = new ThreadingWithClass();
		obj2.start();
	}

}
