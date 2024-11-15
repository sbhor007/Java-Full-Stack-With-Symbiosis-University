package Syncronisation;

class mytable{
	public synchronized static void testtable() {
		for(int i = 0; i < 5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class thread1 extends Thread{
	public void run() {
		mytable.testtable();
	}
}

class thread2 extends Thread{
	public void run() {
		mytable.testtable();
	}
}

public class synchronizedTable {

	public static void main(String[] args) {
		thread1 obj1 = new thread1();
		thread2 obj2 = new thread2();
		obj1.start();
		obj2.start();
	}

}
