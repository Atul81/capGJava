package old.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ardivision {

	public static void main(String... a) throws Exception {
		ArrayList<Integer> divValues = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ar;
		Integer length = Integer.valueOf(br.readLine());
		Integer[] inp = new Integer[length];
		ar = br.readLine().split("\\s");
		for (int i = 0; i < length; i++)
			inp[i] = Integer.valueOf(ar[i]);
		if (inp.length > 0) {
			for (Integer o = 0; o < Integer.MAX_VALUE; o++) {
				if (br.ready())
					divValues.add(Integer.valueOf(br.readLine()));
				else
					break;
			}
		}
		br.close();

		for (Integer x : divValues)
			for (int i = 0; i < length; i++)
				inp[i] = inp[i] / x;

		for (Integer x : inp)
			System.out.println(x);
	}
}
