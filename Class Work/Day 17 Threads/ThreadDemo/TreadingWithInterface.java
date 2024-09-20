package ThreadDemo;

public class TreadingWithInterface implements Runnable {

	public static void main(String[] args) {
		TreadingWithInterface obj = new TreadingWithInterface();
		Thread t = new Thread(obj);
		t.start();
		System.out.println(Thread.currentThread().getName());
		
	}

	@Override
	public void run() {		
		for(int i = 0; i < 5;i++) {
			try {
				Thread.sleep(1000); // 1 second == 1000 ms
				System.out.println(Thread.currentThread().getName());
				System.out.println("I : " + i);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
