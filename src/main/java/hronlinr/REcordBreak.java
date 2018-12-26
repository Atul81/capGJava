package hronlinr;

public class REcordBreak {
	public static void main(String... a) {
		int[] ar = new int[] { 3, 4, 21, 36, 10, 28, 35, 1, 24, 42 };
		int[] re = breakingRecords(ar);
		for (int x : re) {
			System.out.print(x+ " ");
		}
	}

	static int[] breakingRecords(int[] scores) {
		int[] re = new int[2];
		int prev = scores[0];
		int prevd = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > prev) {
				re[0]++;
				prev = scores[i];
			} else if(scores[i] < prevd) {
				re[1]++;
				prevd = scores[i];
			}
		}
		return re;
	}
}
