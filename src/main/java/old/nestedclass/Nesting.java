package old.nestedclass;

import old.nestedclass.StaticOuter.staticInner;

public class Nesting {
	public static void main(String ...a) {
		Outer.Inner inner = new Outer().new Inner();
		inner.func();
		
		Outer outer = new Outer();
		Outer.Inner inner2 = outer.new Inner();
		inner2.func();
		
		MethodOuter methodOuter = new MethodOuter();
		methodOuter.func();
	
		StaticOuter.staticInner inner3 = new StaticOuter.staticInner();
		inner3.func();
		
		System.out.println(StaticOuter.c); 
		new StaticOuter.staticInner();
		System.out.println(staticInner.y);
		
		StaticOuter.staticInner.fin();
		
		Outer.func();
		
		Outer.Inner2.main();
		
		StaticOuter.staticInner.fin();
	}
}

class Outer{
	
	static void func() {
		System.out.println("Direct static reference");
	}
	class Inner {
		void func() {
			System.out.println("Practice Completed");
		}
	}
	
	static class Inner2 {
		static void main() {
			System.out.println("Static reference in  Inner2");
		}
	}
}


class MethodOuter {
	void func() {
		System.out.println("Method Outer");
		
		class MethodInner {
			void func() {
				System.out.println("Method Inner");
			}
		}
		
		MethodInner inner = new MethodInner();
		inner.func();
	}
}

class StaticOuter {
	
	static int c = 9;
	
	static class staticInner{
		
		static int y;
		 	
		void func() {
			System.out.println("Static Inner Reference");
		}
		
		static void fin() {
			System.out.println("Static Invoke");
		}
	}
}
