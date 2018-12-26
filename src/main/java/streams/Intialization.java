package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utils.Employee;

public class Intialization {

	public static void main(String ar[]) {
		Employee[] empDetails = new Employee[9];

		empDetails[0] = new Employee(1, "Zaira", new Long(54354));
		empDetails[1] = new Employee(2, "Shujaat", new Long(5435488));
		empDetails[2] = new Employee(3, "Queen", new Long(6435488));
		empDetails[3] = new Employee(4, "Jack", new Long(7435488));
		empDetails[4] = new Employee(5, "Donald", new Long(58435488));
		empDetails[5] = new Employee(6, "Ronny", new Long(435488));
		empDetails[6] = new Employee(7, "Colleman", new Long(24835488));
		empDetails[7] = new Employee(8, "Kai", new Long(63435488));
		empDetails[8] = new Employee(9, "Green", new Long(96435488));

		Stream<Employee> stream = Stream.of(empDetails);

		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getEmpSalary().compareTo(o2.getEmpSalary());
			}
		};
		
		/*
		 * for same Keyvalues, Using Binary Operator Merge Function
		 */
		Map<Integer, String> collect = stream.sorted(comparator)
				.collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName, (x, y) -> {
					System.out.println(x + "   " + y);
					return x + ", " + y;
				}));
		
		/*
		 * After collector processing
		 */
		
		collect.entrySet().stream().forEach(i -> {
			System.out.println(i.getKey() + "-> " + i.getValue());
		});

		
		/*
		 * Second Streams Initializing and processing
		 */

		Stream<Employee> stream1 = Stream.of(empDetails);

		Map<Integer, String> collect2 = stream1.sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee arg0, Employee arg1) {
				// TODO Auto-generated method stub
				return arg0.getEmpName().compareTo(arg1.getEmpName());
			}
			/*
			 * for returning LinkedHashMap, Binary function is required
			 */
		}).collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName, (x, y) -> x+", "+ y, LinkedHashMap::new));

		/*
		 * After Collector processing 
		 */
		collect2.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		}).forEach(i -> {
			System.out.println(i.getValue() + " " + i.getKey());
		});

		Arrays.sort(empDetails);

		for (Employee e : empDetails)
			System.out.println(" " + e.getEmpName());
	}
}
