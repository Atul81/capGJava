package hronlinr;

public class BirthDay {
	static int cand;

	public static void main(String... a) {
		int[] arr = new int[] { 1, 3, 2, 6, 1, 2 };
		// int y = birthdayCakeCandles(arr);
		int y = divisibleSumPairs(arr.length, 3, arr);
		System.out.println(y);
	}

	static int birthdayCakeCandles(int[] ar) {
		int val = maxCount(ar, ar.length);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == val)
				cand++;
		}
		return cand;
	}

	private static int maxCount(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				return arr[i];
		}
		return maxCount(arr, num - 1);
	}

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0 ; j <ar.length;j++) {
				if((i!=j) && ((ar[i]+ar[j])% k == 0)) {
					count++;
				}
			}
		}
		return count/2;
	}
}
