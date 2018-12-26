package hronlinr;

import java.util.Arrays;
import java.util.List;

public class BirthdayCake {
	static int sum = 0;
	static int count = 0;

	public static void main(String... a) {
		List<Integer> integers = Arrays.asList(1, 2, 1, 3, 2);
		int d = 3;
		int m = 2;
		System.out.println(birthday(integers, d, m));
	}

	static int birthday(List<Integer> s, int d, int m) {
		int j =0;
		for (int i = 0; i < s.size(); i++) {
			while(j < m) {
				if((i+j) < s.size() ? true : false)
				sum += s.get(i+j);
				j++;
			}
			if(sum == d) {
				count++;
			}
			j=0;
			sum=0;
		}
		return count;
	}
}
