package old.hronlinr;

public class Overload {
	public static void main(String ...a) {
		Overload overload = new Overide();
		overload.finc();
		funv("nj");
	}
	void finc() {
		System.out.println("Hellp");
	}
	
	static void funv() {
		System.out.println("fsf");
	}
	
	static void funv(String s) {
		System.out.println("e");
	}
}

class Overide extends Overload{
	@Override
	 void finc() {
		// TODO Auto-generated method stub
		System.out.println("HELP");
	}	
}
