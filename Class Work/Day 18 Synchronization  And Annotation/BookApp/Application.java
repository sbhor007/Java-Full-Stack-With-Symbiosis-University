package BookApp;

public class Application {

	public static void main(String[] args) {
		/*
		Book b = new Book("Java");
		BookReader bookReader = new BookReader(b);
		BookReader bookReader1 = new BookReader(b);
		BookWriter bookWriter = new BookWriter(b);
		Thread t1 = new Thread(bookReader, "Santosh");
		Thread t2 = new Thread(bookWriter, "Harshal");
		Thread t3 = new Thread(bookReader1,"Durgesh");
		t1.start();
		t2.start();
		t3.start();
		*/
		
		Book b1 = new Book("My Java");
		
		BookReader bookReader1 = new BookReader(b1);
		BookReader bookReader2 = new BookReader(b1);
		
		Thread A1 = new Thread(bookReader1,"Santosh");
		Thread A2 = new Thread(bookReader2,"Harshal");
		
		A1.start();
		A2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		BookWriter bookWriter = new BookWriter(b1);
		Thread bookWriterThread = new Thread(bookWriter,"Durgesh");
		bookWriterThread.start();
		
		
		
	}

}
