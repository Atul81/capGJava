package old.streams;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primitives {
	public static void main(String... a) {
		IntStream intStream = IntStream.range(2, 6);
		intStream.forEach(i -> {
			System.out.println(i);
		});

		RegexPtrn.PatternMatching();
	}
}

class RegexPtrn {
	static void PatternMatching() {
		String newLine = System.getProperty("line.separator");
		Pattern pattern = Pattern.compile("Atul");
		Pattern pattern2 = Pattern.compile("Atul", Pattern.CASE_INSENSITIVE);
		String[] as;
		String inp = "My name is Atul. ATUL   is in Hyderabad.";
		as = inp.split("\\s");
		Stream<String> inpStream = Stream.of(as);
		
		List<String> collect = inpStream.filter(i -> {
			return i.length() > 0;
		}).collect(Collectors.toList());
		
		for(String col: collect)
			System.out.println(col + newLine);
		
		
		collect.toArray(as);
		
		System.out.println(as.length);
		
		
		for(String q: as)
			System.out.println(q);
		
		Matcher match = pattern2.matcher("ATUL");
		
		if(match.find())
			System.out.println(match.start() + " " + newLine+ " " + match.end());
	}
}
