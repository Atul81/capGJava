package book;

public class CNOverride extends Params {
	int a = 5, b=6, c = 9;
	public static void main(String args[]) {		
		CNOverride override = new CNOverride(4, 4, 1);
		rename();
		int x = override.a;
		System.out.println(x);
	}
	private CNOverride(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public CNOverride(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public CNOverride(CNOverride cnOverride) {
		this.a = cnOverride.a;
		this.b = cnOverride.b;
		this.c = cnOverride.c;
	}
	
}

class Params{
	
	static void rename() {
		System.out.println("AYyye haalllo");
	}
}
