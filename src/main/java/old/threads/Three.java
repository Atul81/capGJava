package old.threads;

public class Three extends Thread{
	Three() {
		super("Check");
		System.out.println("COnstructor THread" + this);
		start();
	}
	
	public void run() {
		for(int i =0; i< 5; i++) {
			System.out.println("Threading looping" + i);
			try {
				Thread.sleep(231);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting THread class loop");
	}
}
