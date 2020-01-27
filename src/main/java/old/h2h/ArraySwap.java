package old.h2h;

public class ArraySwap {
	public static void main(String args[]) {
		int a[] = new int[] { 3, 4, 2, 1 };
		int co = minimumSwaps(a);
		System.out.println(co);
	}

	static int minimumSwaps(int[] arr) {

		int co = 0;
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = j+1; i < arr.length - 1; i++) {
				if (i != arr.length - 1) {
					if (arr[i + 1] < arr[i]) {
						int temp = arr[i + 1];
						arr[i + 1] = arr[i];
						arr[i] = temp;
						co++;
					}
				}
			}
		}
		return co;
	}
}
