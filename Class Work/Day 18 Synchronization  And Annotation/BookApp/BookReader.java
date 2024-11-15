package BookApp;

public class BookReader implements Runnable {
	
	Book b1;
	

	public BookReader(Book b1) {
		super();
		this.b1 = b1;
	}


	@Override
	public void run() {
		synchronized(b1) {
			System.out.println(Thread.currentThread().getName());
			try {
				b1.wait();
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Book Reading Over " + Thread.currentThread().getName());
		}
	}

}
