package old.book;

public class InRefer {
	public static void main(String... a) {
		Bacha bacha = new Bacha(2);
		Inher inher = new Inher(1,4);
		bacha.func();
		bacha.i = 6;
		bacha.val();
		inher.func();
	}
}
