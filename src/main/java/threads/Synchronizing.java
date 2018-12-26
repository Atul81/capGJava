package threads;

class Callme {
	void message(String msg) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Print message" + msg);
		for (int i = 0; i < 4; i++)
			System.out.println("Print the thread and message" + msg + i);

	}
}

class Threading extends Thread {
	String msg;
	Thread t;
	Callme callme;

	Threading(String msg, Callme callme) {
		this.msg = msg;
		this.callme = callme;
		t = new Thread(this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (callme) {
			callme.message(msg);
		}
	}
}

class Threadng extends Thread {
	String msg;
	Thread t;
	Callme callme;

	Threadng(String msg, Callme callme) {
		this.msg = msg;
		this.callme = callme;
		t = new Thread(this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		callme.message(msg);
	}
}

public class Synchronizing {
	public static void main(String... ard) {
		Callme callme = new Callme();
		Threading threading = new Threading("First", callme);
		Threadng threading1 = new Threadng("Second", callme);
		Threading threading2 = new Threading("Third", callme);
		threading.t.start();
		threading2.t.start();
		threading1.t.start();
	}
}
