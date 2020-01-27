package old.hronlinr;

import java.util.Scanner;

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	int count = 0;
    	for(int i = 1; i< (n/2)+1; i++) {
    		if(n%i == 0)
    			count += i;
    	}
        return count+1;
    }
}

interface AdvancedArithmetic {
	int divisorSum(int n);
}

interface Idnknnw {
	default void hlew()  {
		System.out.println("Gujarat");
	}
	
    void chalo();
}

public class Interfaces {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        Idnknnw idnknnw =new Idnknnw() {

			@Override
			public void chalo() {
				System.out.println("Gujarat aajao");				
			}};
        idnknnw.hlew();
        idnknnw.chalo();
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName()) ;
        System.out.println(sum);
    }
}
