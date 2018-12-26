package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import utils.Desc;
import utils.Details;

public class One {
	public static void main(String ...a) {
		Integer[] arr = new Integer[] {1,2,3,4,5,6};
		Stream<Integer> streams = Stream.of(arr);
		List<Integer> asList = Arrays.asList(arr);
		List<Integer> collect = asList.stream().filter(i -> {
			return i >=1;
		}).skip(2).collect(Collectors.toList());
		System.out.println(collect);
		Details details = new Details();
		details.cunt = "No";
		details.setCompany("Capgemini");
		details.setAge(23);
		details.setCtc(660000);
		details.setName("Atul");
		Details details3 = new Details();
		details3.cunt = "Yes";
		details3.setCompany("Delloite");
		details3.setAge(24);
		details3.setCtc(1000000);
		details3.setName("Jhaat");
		List<Details> details2 = new ArrayList<>();
		details2.add(details);
		details2.add(details3);
		Set<Details> collect2 = details2.stream().filter( obj -> {
			return obj.getAge() == 23;
		}).collect(Collectors.toSet());
		
		List<Desc> collect3 = details2.stream().filter(i -> {
			return i.getAge() == 23;
		}).map(i -> {
			Desc desc = new Desc();
			desc.setName(i.getName());
			return desc;
		}).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println(collect3);
		IntStream intStream = IntStream.range(1, 3);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		intStream.forEach( i -> {
			System.out.println(i);
		});
		System.out.println(longStream);
		
		Stream<String> streamOfString =
				  Pattern.compile(", ").splitAsStream("a, b, c");
		streamOfString.forEach( i -> {
			System.out.println(i);
		});
	}
}
