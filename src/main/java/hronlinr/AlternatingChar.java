package hronlinr;

import java.util.Scanner;

public class AlternatingChar {
	public static void main(String... a) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		System.out.println(alternatingCharacters(s));
	}

	static int alternatingCharacters(String s) {
		char[] charArray = s.toCharArray();
		char prev = charArray[0];
		int count = 0;
		for (char x : charArray) {
			if (x == prev) {
				count++;
			}
			prev = x;
		}
		return count - 1;
	}
}
