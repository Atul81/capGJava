package hronlinr;

public class HourGlass {
	public static void main(String... f) {
		int[][] ar1 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
		func(ar1);
	}

	static int func(int[][] ar1) {
		Arra[] arras = new Arra[16];
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 7; j++) {
				int k = j;
				while (k < j + 3) {
					arras[i].ar[j] = ar1[j][k];
				}
			}
		}
		return 0;
	}
}

class Arra {
	int[] ar = new int[7];
}
