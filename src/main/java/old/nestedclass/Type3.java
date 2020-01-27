package old.nestedclass;

public class Type3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticOute1r.Inner inner = new staticOute1r.Inner();
		inner.func();
		staticOute1r.Inner.staticFun();
		System.out.println(staticOute1r.Inner.c);
		inner.func();
	}

}

class staticOute1r {
	static class Inner {

		static int c = 6;

		void func() {
			System.out.println("Hello");
			System.out.println(c);
		}

		static void staticFun() {
			System.out.println("static Hello");
		}
	}
}
