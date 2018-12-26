package interview;

public class Inorder {
	public static void main(String ...a) {
		String fs;
		float floatVar = (float) 32.333;
		int intVar = 6;
		String stringVar ="Sut";
		fs = String.format("The value of the float variable is " +
		                   "%f, while the value of the integer " +
		                   "variable is %d, and the string " +
		                   "is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
	}
}