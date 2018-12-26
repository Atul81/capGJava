package interview;

public class FlippingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flippingBits(4);

	}

	static long flippingBits(long n) {
		String substring = Long.toBinaryString(n & 0xffffffffL | 0x100000000L ).substring(1);
		substring = substring.replace("0", "2");
		substring = substring.replace("1", "0");
		substring = substring.replace("2", "1");
		Long decode = Long.parseLong(substring, 2);
		System.out.println(decode);
		return 0;
    }
}
