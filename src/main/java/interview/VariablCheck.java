package interview;

public class VariablCheck {
	 public static void main(String[] args) {
		 breaking:
	        for (int i=0; i < 5; i++) {
	            for (int j=0; j < 5; j++) {
	                if (i * j > 6) {
	                    System.out.println("Breaking");
		                System.out.println(i + " " + j);
	                    break breaking;
	                } else 
	                	continue breaking;
	            }
	        }
	        System.out.println("Done");
	    }
}
