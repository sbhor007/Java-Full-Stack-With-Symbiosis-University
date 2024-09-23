package BookApp;

public class BookWriter implements Runnable {
	
	Book b1;
	

	public BookWriter(Book b1) {
		super();
		this.b1 = b1;
	}


	@Override
	public void run() {
		synchronized(b1) {
			System.out.println("Writer writs Book : "+ b1.getTitle());
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				b1.setIscomplet(true);
				System.out.println("Book completed");
//				b1.notify();
				b1.notifyAll();
				System.out.println("Notify Reader");
			
		}
		
	}

}
