package old.h2h;

public class ArrayLeft {

	public static void main(String args[]) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int d = 2;
		a = rotLeft(a, d);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static int[] rotLeft(int[] a, int d) {
		while (d > 0) {
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				if (i != a.length - 1) {
					a[i] = a[i + 1];
				} else {
					a[i] = a[i];
				}
			}
			a[a.length - 1] = temp;
			d--;
		}
		return a;
	}
}
