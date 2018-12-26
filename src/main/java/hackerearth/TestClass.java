package hackerearth;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long testCases = sc.nextLong();
		if(testCases > 100) 
			testCases = 100;
		Detail details = new Detail();
		while (testCases > 0) {
			long coins = sc.nextLong();
			long pick = sc.nextLong();
			solution(coins, pick);
			details.setCoins(coins);
			details.setPick(pick);
			System.out.println(solution(details));
			testCases--;
		}
		sc.close();
	}

	static String solution(long coins, long pick) {
		double left = coins;
//		if (coins < pick)
//			return "Bob";
//		else if (coins == pick)
//			return "Alice";
//		else {
			int i = 0;
			while (i <= coins) {
				double picking = pick;
				for(int h = 0; h<=i;h++)
					picking = pick*picking;
				left = left - picking;
				if (left == picking || left < 0)
					return "Bob";
				else if (left < picking)
					return "Alice";
				left = left - picking;
				if (left == picking || left < 0)
					return "Alice";
				else if (left < picking)
					return "Bob";
				i++;
//			}
		}
		return null;
	}

	static String solution(Detail inp) {
		double left = inp.getCoins();
		if (inp.getCoins() < inp.getPick())
			return "Bob";
		else if (inp.getCoins() == inp.getPick())
			return "Alice";
		else {
			int i = 1;
			while (i <= inp.getCoins()) {
				left = left - Math.pow(inp.getPick(), i);
				if (left == Math.pow(inp.getPick(), i) || left < 0)
					return "Bob";
				else if (left < Math.pow(inp.getPick(), i))
					return "Alice";
				left = left - Math.pow(inp.getPick(), i);
				if (left == Math.pow(inp.getPick(), i) || left < 0)
					return "Alice";
				else if (left < Math.pow(inp.getPick(), i))
					return "Bob";
				i++;
			}
		}
		return null;
	}
}

class Detail {
	private long coins;
	private long pick;

	public long getCoins() {
		return coins;
	}

	public void setCoins(long coins) {
		this.coins = coins;
	}

	public long getPick() {
		return pick;
	}

	public void setPick(long pick) {
		this.pick = pick;
	}

}
