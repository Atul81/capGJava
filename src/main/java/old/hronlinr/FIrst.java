package old.hronlinr;

public class FIrst {
	public static void main(String... args) {
		double meal_cost = 10.25;

		int tip_percent = 17;

		int tax_percent = 5;

		solve(meal_cost, tip_percent, tax_percent);
	}

	private static void solve(double meal_cost, int tip_percent, int tax_percent) {
		// TODO Auto-generated method stub
		double tipadd = meal_cost * tip_percent * 0.01;
		double taxadd = meal_cost * tax_percent * 0.01;
		int y = (int) (tipadd + taxadd);
		System.out.println(tipadd + taxadd);
		Double totalCost = (meal_cost + tipadd + taxadd);
		System.out.println(Math.round(totalCost));
	}
}

class Ar {
	long func() {
		int ar[]=new int[] {1,2,3,4,5};
	/*	return (for (int i =0; i < ar.length ;i++) {
			long sum = ar[i];
		});
	}*/
	return 0; 
	}
}
