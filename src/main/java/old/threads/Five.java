package old.threads;

public class Five implements Runnable {
	Thread t;
	String name;
	
	
	public Five(String name) {
		t = new Thread(this, "Constructor");
		this.name = name;
		System.out.println("COnstructor of" + this.name+ " " + t);
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ;i < 5; i++) {
			System.out.println(this.name + "Printing thread loop" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting loop" + this.name);
	}

}
