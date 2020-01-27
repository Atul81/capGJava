package old.threads;

public class Six {
	public static void main(String ...d) {
		Five five = new Five("One");
		five.t.start();
		Five five2 = new Five("Two");
		five2.t.start();
		Five five3 = new Five("Three");
		five3.t.start();
		
		for(int i = 0; i< 5; i++) {
			try {
				five.t.join();
				// five2.t.start();
				five2.t.join();
				five3.t.join();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting main loop");
	}
}
