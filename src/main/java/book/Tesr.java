package book;

public class Tesr {
	public static void main(String... args) {
		System.out.println("Entered");
		Invokes.func();
		Invokes.func(10);
		
	}
}

class Invokes {
	static void func() {
		System.out.println("Entered no param");
	}
	
	/*static void func(int i) {
		System.out.println("Entered int param");
	}*/
	
	static void func(double i) {
		System.out.println("Entered double param");
	}
}
