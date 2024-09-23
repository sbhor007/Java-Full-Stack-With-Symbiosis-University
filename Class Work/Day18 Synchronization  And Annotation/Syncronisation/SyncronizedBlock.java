package Syncronisation;

class MyClassSincronized{
	private static int count = 0;
	public void add(int value) {
		synchronized(this) {
			this.count += value;
			System.out.println(count);
		}
	}
}

public class SyncronizedBlock extends Thread {
	
	MyClassSincronized obj = new MyClassSincronized();
	public void run() {
		obj.add(10);
	}

	public static void main(String[] args) {
		SyncronizedBlock obj1 = new SyncronizedBlock();
		SyncronizedBlock obj2 = new SyncronizedBlock();
		obj1.start();
		obj2.start();

	}

}
