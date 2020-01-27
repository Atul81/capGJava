package old.interview;

public class CountingValleys {
	public static void main(String... a) {
		countingValleys(8, "UDDDUDUU");

	}

	static int countingValleys(int n, String s) {
		int upHill = 0;
		int downHill = 0;
		for(int i = 0; i<= s.length(); i++) {
			if(s.charAt(i) == 'U')
				upHill++;
			else if(s.charAt(i) == 'D')
				downHill++;
			/*else if(upHill == downHill && i != )
				
			*/	
		}
		return 0;
	}
}
