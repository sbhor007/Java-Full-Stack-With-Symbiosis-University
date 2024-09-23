package InterThreadCommunication;

import Syncronisation.synchronizedTable;

class OddEvenClass{
	boolean flag = false;
	public synchronized void printOddNumber(int number) throws InterruptedException{
		while (flag) {
			wait();
		}
		flag = true;
		Thread.currentThread().setName("Odd Thread :: ");
		System.out.println(Thread.currentThread().getName() + " " + number);
		notify();
	}
	
	public synchronized void printEvenNumber(int number) throws InterruptedException{
		while (!flag) {
			wait();
		}
		flag = false;
		Thread.currentThread().setName("Even Thread :: ");
		System.out.println(Thread.currentThread().getName() + " " + number);
		notify();
	}
}

class Odd extends Thread{
	int maxOddNumber;
	OddEvenClass odd;
	public Odd(int maxOddNumber, OddEvenClass odd) {
		super();
		this.maxOddNumber = maxOddNumber;
		this.odd = odd;
	}
	
	public void run() {
		int minOddNum = 1;
		try {
			while(minOddNum <= maxOddNumber) {
				odd.printOddNumber(minOddNum);
				minOddNum += 2;
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class Even extends Thread{
	int maxEvenNumber;
	OddEvenClass even;
	
	
	public Even(int maxEvenNumber, OddEvenClass even) {
		super();
		this.maxEvenNumber = maxEvenNumber;
		this.even = even;
	}


	public void run() {
		int minEvenNum = 2;
		try {
			while(minEvenNum <= maxEvenNumber) {
				even.printEvenNumber(minEvenNum);
				minEvenNum += 2;
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class OddEven {
	
	
	

	public static void main(String[] args) {
		OddEvenClass obj = new OddEvenClass();
		Odd oddObj = new Odd(10, obj);
		Even evenObj = new Even(10, obj);
		
		oddObj.start();
		evenObj.start();

	}

}
