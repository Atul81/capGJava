package old.book;

public class Nesting {
	static int a = 0;
	public static void main(String ...a) {
		a.hashCode();
		System.out.println(a + "Hashcode 1    " +a.hashCode() + "     " + a.length);
		inner.func();
	}
	static class inner{
		static void func() {
			System.out.println("Enetrred");
			a = 4;
		}
	}
}

class Nm{
}
