package old.book;

public class Dotd {
	public static void main(String ...s) {
		Integer v = 5;
		check();
		v.intValue();
		System.out.println("For int value" + v);
		String str = "1300910";
		int nstr = Integer.parseInt(str);
		System.out.println(nstr);
		System.out.println(Integer.toString(nstr));
		System.out.println("Vale Check" + Integer.numberOfTrailingZeros(Integer.parseInt(str)));
		System.out.println("Vale Check" + Integer.numberOfLeadingZeros(Integer.parseInt(str)));
	}
	
	static void check(boolean ...v) {
		System.out.println(v.length + "   "+ v.toString());
	}
}
