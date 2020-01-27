package old.book;

public class Inher {
	public int i = 2;
	public int j = 3;

	public int getI() {
		return i;
	}

	public Inher(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	void func() {
		System.out.println("hi");
	}

	public static void main(String... a) {
		Inher inher = new Inher(2,3);
		inher.func();
	}

}

class Bacha extends Inher {
	int k = 9;

	void val() {
		System.out.println(i + j + k);
		func();
	}

	public Bacha(int k) {
		super(2,3);
		this.k = k;
	}
}


