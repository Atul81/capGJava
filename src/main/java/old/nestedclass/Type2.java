package old.nestedclass;

public class Type2 {
	public static void main(String ar[]) {
		Outer1.Inner inner = new Outer1().new Inner();
		inner.func();

		Outer1 outer = new Outer1();
		Outer1.Inner inner2 = outer.new Inner();
		inner2.func();
	}
}

class Outer1 {
	class Inner {
		void func() {
			System.out.println("Inner  Class");
		}
	}
}
