package hronlinr;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SherlockValid {
	public static void main(String... a) {
		short u = Short.MAX_VALUE;
		System.out.println(u);
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		System.out.println(isValid(s));
//		scan.close();
	}

	static String isValid(String s) {
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
		char[] charArray = s.toCharArray();
		for (char x : charArray) {
			if (hashMap.containsKey(x)) {
				hashMap.put(x, hashMap.get(x) + 1);
			} else
				hashMap.put(x, 1);
		}
		LinkedHashMap<Integer, Integer> hashMap2 = new LinkedHashMap<>();
		for (char x : charArray) {
			hashMap2.put(hashMap.get(x), hashMap2.get(hashMap.get(x)) == null? 1: hashMap2.get(hashMap.get(x))+1 );
		}
		System.out.println(hashMap2.toString());
		int c=0;
		return null;
	}
}
