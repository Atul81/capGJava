package threads;

public class Four {
	public static void main(String ...a) {
		new Three();
		for(int i =0; i< 5; i++) {
			System.out.println("Extension Loop" +i);
			try {
				Thread.sleep(321);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Loop of extension");
	}
}
