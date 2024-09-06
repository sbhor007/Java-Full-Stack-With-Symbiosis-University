package InterfaceInheritance;

interface Player{
	public void push();
	public void start();
	public void stop();
}

interface MusicPlayer extends Player{
	default public void next() {
		System.out.println("Next From MusicPlayer");
	}
}

class SmartPhone implements MusicPlayer{
	public void push() {
		System.out.println("Push");
	}
	public void start() {
		System.out.println("Start");
	}
	public void stop() {
		System.out.println("Stop");
	}
}

public class InterfaceInheritanceExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.start();

	}

}
