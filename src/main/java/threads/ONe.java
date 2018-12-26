package threads;

public class ONe implements Runnable{

	Thread t;
	
	ONe() {
		t = new Thread(this, "Constructor Thread");
		System.out.println("Constructor Thread"+ t);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 5; i++) {
			System.out.println("Thread Looping" + i);
			try {
				Thread.sleep(234);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Illegal Exception");
			}
		}
		System.out.println("Exiting Thread Loop");
	}

}
