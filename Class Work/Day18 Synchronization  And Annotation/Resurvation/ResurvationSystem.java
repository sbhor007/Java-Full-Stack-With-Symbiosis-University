package Resurvation;

class Resurv extends Thread {
	int noOfseats = 2;
	int wanted;

	public Resurv(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTiket();
	}

	private void bookTiket() {
		String tName = Thread.currentThread().getName();
		System.out.println("No of Seets available");
		synchronized (this) {
			if (noOfseats >= wanted) {
				System.out.println("Trying to book " + wanted + " Seats available " + noOfseats);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				noOfseats -= wanted;
				System.out.println(wanted + " Seets Booked For " + tName);
			} else {
				System.out.println("Seets not Availble");
			}
		}

	}
}

public class ResurvationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resurv res = new Resurv(1);
		Thread t1 = new Thread(res);
		Thread t2 = new Thread(res);
		Thread t3 = new Thread(res);
		Thread t4 = new Thread(res);
		t1.setName("Passenger - 1");
		t2.setName("Passenger - 2");
		t3.setName("Passenger - 3");
		t4.setName("Passenger - 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
