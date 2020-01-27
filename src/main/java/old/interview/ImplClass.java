package old.interview;

public class ImplClass extends Abstracting{

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public static void main(String ...h) {
		Abstracting abstracting = new ImplClass();
		abstracting.func();
	}

	@Override
	void chec() {
		// TODO Auto-generated method stub
		System.out.println("Pushed Checking");
	}

}
