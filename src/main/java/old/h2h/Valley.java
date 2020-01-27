package old.h2h;

public class Valley {
	public static void main (String args[]) {
int n =8;
String str = "UDDDUDUU";
int count = Soln.countingValleys(n, str);
System.out.println(count);
 }
}

class Soln {
	static int countingValleys(int n, String s) {
		int valley = 0;
		 long u = s.chars().filter(ch -> ch=='U').count();
         long d = s.chars().filter(ch -> ch=='D').count();
		System.out.println(u + "  " + d);
		return valley;
	}
}
