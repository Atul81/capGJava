package old.nestedclass;

class Inner {
	void func() {
		System.out.println("Inner Class hello");

		class InnerIN {
			void innerNestedMethod() {
				System.out.println("Inner Nested Hello");
			}
		}
		InnerIN innerIN = new InnerIN();
		innerIN.innerNestedMethod();
	}
}

public class TypeOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner inner = new Inner();
		inner.func();
	}

}
