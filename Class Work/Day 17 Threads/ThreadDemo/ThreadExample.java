package ThreadDemo;

import java.util.Iterator;

class A1 extends Thread {
	public void run() {
		System.out.println("Tread A");
		System.out.println("i in Thread A");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - i = " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Thread A is Finished");
	}
}

class B1 extends Thread {
	public void run() {
		System.out.println("Tread A");
		System.out.println("i in Thread B");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - i = " + i);
		}
		System.out.println("Thread B is Finished");
	}
}

public class ThreadExample {

	public static void main(String[] args) {

		A1 threadA = new A1();
		threadA.setName("A");
		B1 threadB = new B1();
//		B1 threadB1 = new B1();
		threadB.setName("B");
		// Both the above theads are in runnable state
		// running state of Thread A & B
		threadA.start();
		// move control to another thread
		threadA.yield();
		// Blocked state of B
		try {
			threadA.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadB.start();
//		threadB1.start();
		System.out.println("Main thread is ended");
	}

}
