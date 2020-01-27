package old.h2h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

import old.hronlinr.SingletonExample;

public class Classses extends Parent {
	public static List<String> ranks = new LinkedList<>();
	static {
		ranks.add("Atul");
	}

	public static void main(String... a) {
		Parent p = new Parent();
		p.c = 4;
		p.func();
		System.out.println(SingletonExample.getSingletonInstance());
		SingletonExample.getSingletonInstance().printSingleton();
		ranks.add("Lieutenant");
		ranks.add("Captain");
		ranks.add("Major");

		Map<String, String> map = new Hashtable<>();
		Map<String, String> map1 = new HashMap<>();
		NavigableMap<String, String> map2 = new TreeMap<>();
		Map<String, String> map3 = new ConcurrentHashMap<>();
		BlockingQueue<String> map4 = new LinkedBlockingQueue<>();
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map1);
		Stack<Integer> stack = new Stack<>();
		PriorityQueue<String> pq = new PriorityQueue<>();
	}

	static Classses funb() {
		return null;

	}
}

class Parent {
	int c;

	void func() {
		int d = this.c;
		System.out.println("halo" + d);
	}
}
