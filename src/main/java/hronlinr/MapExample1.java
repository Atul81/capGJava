package hronlinr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class MapExample1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Adding elements to map
		map.put(1, "Arit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map
		Set<Entry<Integer, String>> set = map.entrySet();// Converting to Set so that we can traverse
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		/*
		 * for (Map.Entry<Integer, String> m :
		 * map.entrySet().stream().sorted().forEach(action)) {
		 * System.out.println(m.getKey() + " " + m.getValue()); }
		 */

		long count = map.entrySet().stream().filter(i -> {
			boolean equals = i.getValue().equals("Amit");
			return equals;
		}).mapToInt(i -> {
			return i.getValue().length() * i.getValue().length();

		}).sum();
		Optional<Entry<Integer, String>> findAny = map.entrySet().stream().findAny();
		findAny.isPresent();
		System.out.println(count);
		map.entrySet().stream().forEach(em -> {
			System.out.println(em.getValue());
		});
		boolean anyMatch = map.entrySet().stream().allMatch( n -> {
			return n.getKey() == 2;
		});
		System.out.println(anyMatch);
		Optional<Entry<Integer, String>> findFirst = map.entrySet().stream().filter(i -> {
			return i.getValue().startsWith("A");
		}).findFirst();
		System.out.println(findFirst.get());
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> intOptional = numbers.reduce((i, j) -> {
			return i * j;
		});
		System.out.println(intOptional.get());
		if (intOptional.isPresent())
			System.out.println("Multiplication = " + intOptional.get()); // 120

	}
}
