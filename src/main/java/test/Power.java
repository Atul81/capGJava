package test;

import java.util.Date;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)Math.pow(2, 4));
		
		testOne();
	}
	
	static void testOne() {
		Date date = new Date();
		System.out.println(date);
		
		Date dt = (Date) date.clone();
		System.out.println(dt.getMonth());
	}

}
