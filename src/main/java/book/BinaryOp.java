package book;

public class BinaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 0;
		int a = 0b1000010;
		int b = 0b1011110;
		int c = a - b;
		System.out.println(Integer.toBinaryString(c) + "   " + c + "   " + b);
		first: {
			second: {
			y = 8;
			System.out.println(Integer.toBinaryString(c) + "   " + c + "   " + b);
			}
		}
		BinaryOp binaryOp = new BinaryOp();
		int x = binaryOp.hashCode();
		System.out.println(x);
		if(x == binaryOp.hashCode())
		return;
		System.out.println(y);
		System.out.println(y);
		}
}
