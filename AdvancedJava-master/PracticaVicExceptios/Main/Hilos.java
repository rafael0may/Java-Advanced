package Main;

public class Hilos extends Thread {
	public Hilos(String str) {
		super(str);
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Done " + getName());
	}
	public static void main(String[] args) {
		new Hilos("Jamaica").start();
		new Hilos("Fiji").start();
		
	}

}
