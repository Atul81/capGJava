package old.hronlinr;

public class MPpping {
	public static void main(String[] argh) {
		/*final Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			hashMap.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if (hashMap.containsKey(s)) {
				System.out.println(hashMap.get(s));
			}
		}
		in.close();
		System.out.println(factorial(4));*/
		func(31);
	}

	static int factorial(int n) {
	        int i = n-1;
	        if(n == 0 || n == 1 || n == 2) {
	            return n;
	        }
	        while(i > 0) {
	        	n = n*i;
	        	i--;
	        }
	        return n;
	    }
	
	static void func(int n) {
		String r = Integer.toBinaryString(n);
		long count = r.chars().filter(ch -> ch == '1').count();
		System.out.println(count + " "+ r);
	}
}
