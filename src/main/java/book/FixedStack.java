package book;

import java.util.Stack;

public class FixedStack<T> {
	public static void main(String ...a) {
		
		Stack<Object> stack =new Stack<Object>();
		stack.setSize(0);
		stack.push(5);
		stack.push(8);
		stack.push("Atul");
		System.out.println(stack.peek());
		System.out.println(stack.indexOf(8));
		System.out.println(stack.size());
	}
}
