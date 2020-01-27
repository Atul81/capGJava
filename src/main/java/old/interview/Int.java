package old.interview;

public interface Int {
	static void func() {
		System.out.println("Hllo");
	}
	
	default void che() {
		System.out.println("Check hllo");
	}
	
	void chc();
}
