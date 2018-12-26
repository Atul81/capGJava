package threads;

public class Two {
	public static void main(String... g) {
		new ONe();
		for (int k = 0; k < 5; k++) {
			System.out.println("Thread Init print");
			try {
				Thread.sleep(123);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Extended loop");
	}
}
