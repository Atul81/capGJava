package old.hronlinr;

import java.text.DecimalFormat;

public class Methoding {
	public static void main(String... a) {
		int[] arr = new int[] { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);
	}

	static void plusMinus(int[] arr) {
		Extraction extraction;
		extraction = (array) -> {
			double[] count = new double[3];
			for (int x : arr) {
				if (x > 0)
					count[0]++;
				else if (x == 0)
					count[2]++;
				else
					count[1]++;
			}
			return count;
		};
		double[] check = extraction.findElements(arr);
		for (int i = 0; i < check.length; i++) {
			DecimalFormat decimalFormat = new DecimalFormat("#0.000000");
			// decimalFormat.format()
			System.out.println(decimalFormat.format(check[i] / arr.length));
		}
	}
}

interface Extraction {
	double[] findElements(int[] array);
	default void print() {
		System.out.println("Printing the values");
	}
}
