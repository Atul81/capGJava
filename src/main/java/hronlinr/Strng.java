package hronlinr;

import java.util.Scanner;

public class Strng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner scan = new Scanner(System.in);
		Integer c = scan.nextInt();
		scan.nextLine();
		while (c > 0) {
			String x = scan.nextLine();
			char[] charArray = x.toCharArray();
			String anse = "";
			String ansd = "";
			for (int i = 0; i < charArray.length; i++) {
				if (i % 2 == 0) {
					anse += charArray[i];
				} else {
					ansd += charArray[i];
				}
			}
			x = anse + "  " + ansd;
			System.out.println(x);
			c--;
		}
		scan.close();
	}
}
