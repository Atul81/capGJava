package old.hronlinr;

import java.util.ArrayList;
import java.util.Collections;

public class Second {

	static int diagonalDifference(int[][] arr, int m) {
		int pri = 0;
		int sec = 0;
		for (int i = 0; i < m; i++) {
			pri += arr[i][i];
			sec += arr[i][m - 1 - i];
		}
		return Math.abs(pri - sec);
	}

	public static void main(String... ar) {
		int[][] ar1 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
		System.out.println(ar1[0].length);
		int[] ar2 = new int[] { 23, 38, 83, 97 };
		// System.out.println(diagonalDifference(ar1, 4));
		// staircase(4);
		// miniMaxSum(ar2);
		// birthdayCakeCandles(ar2);
		// timeConversion("12:05:45PM");
		gradingStudents(ar2);

	}

	static void staircase(int n) {
		int i = 1;
		while (i <= n) {
			int j = i;
			int s = n - j;
			while (s > 0) {
				System.out.print(" ");
				s--;
			}
			while (j > 0) {
				System.out.print('#');
				j--;
			}
			System.out.println();
			i++;
		}
	}

	static void miniMaxSum(int[] arr) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Integer[] art = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ar.add(arr[i]);
		}
		Collections.sort(ar);
		ar.toArray(art);
		long max = 0;
		long min = 0;
		for (int i = 0; i < art.length; i++) {
			if (i != art.length - 1) {
				min += art[i];
			}
			if (i > 0) {
				max += art[i];
			}
		}
		System.out.println(min + " " + max);
	}

	static int birthdayCakeCandles(int[] ar) {
		int check = ar.length;
		int count = 0;
		while (check >= 0) {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] == check) {
					count++;
				}
			}
			if (count == 0) {
				check--;
			} else {
				break;
			}
		}
		System.out.println(count);
		return count;
	}

	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		String qtr = s.substring(s.length() - 2, s.length());
		String et = s.substring(0, 2);
		Integer rt = Integer.valueOf(et);
		String ans = null;
		if (rt < 12 && qtr.equalsIgnoreCase("PM")) {
			rt = rt + 12;
			ans = (rt + s.substring(2, 8));
		} else if (rt >= 10 && rt != 12 && qtr.equalsIgnoreCase("AM")) {
			ans = (rt + s.substring(2, 8));
		} else if (rt == 12) {
			if (qtr.equalsIgnoreCase("AM"))
				ans = "00" + s.substring(2, 8);
			else
				ans = (rt + s.substring(2, 8));
		} else
			ans = "0" + rt + s.substring(2, 8);
		System.out.println(ans);
		return qtr;
	}

	static int[] gradingStudents(int[] grades) {
		/*
		 * Write your code here.
		 */
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 40 && grades[i] >= 38) {
				grades[i] = 40;
			} else {
				int u = grades[i] % 10;
				int y = grades[i] / 10;
				if (u < 5 && u > 0) {
					if (((y * 10 + 5) - grades[i]) < 3) {
						grades[i] = y * 10 + 5;
					}
				} else if (u > 5 && u < 10) {
					if (((y * 10 + 10) - grades[i]) < 3) {
						grades[i] = y * 10 + 10;
					}
				}
			}
		}
		return grades;
	}

}
