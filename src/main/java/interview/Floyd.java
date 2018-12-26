package interview;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		int rows = 1;
		for(int i = 1; i <= x; i++) {
			int loopr = rows;
			while (loopr > 0) {
				System.out.print(i + " ");
				i = i+1;
				loopr--;
			}
			i = i-1;
			rows++;
			System.out.println(" ");
		}
	}

}
