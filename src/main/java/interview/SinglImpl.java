package interview;

class Singelton {
	private static Singelton sigelton;
	private Singelton() {
		
	}
	
	public static synchronized Singelton getSingelton() {
		if (null == sigelton) {
			synchronized (sigelton) {
				if(null == sigelton)
					sigelton = new Singelton();
			}
        }
        return sigelton;
	}
	
	static void name() {
		System.out.println("Check got the name");
	}
}

public class SinglImpl {
	public static void main(String ...a) {
		Singelton.name();
	}
}
