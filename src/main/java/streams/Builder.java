package streams;

import java.util.stream.Stream;

import org.apache.log4j.Logger;

import utils.Employee;

public class Builder {

	static Logger logger = Logger.getLogger(Builder.class);

	public static void main(String... a) {
		Stream.Builder<Employee> streamB = Stream.<Employee>builder();
		streamB.accept(new Employee(1, "Zaira", new Long(54354)));
		streamB.accept(new Employee(3, "Queen", new Long(6435488)));
		streamB.accept(new Employee(7, "Colleman", new Long(24835488)));

		Stream<Employee> empStream = streamB.build();
		empStream.forEach(i -> {
			System.out.println(i.getEmpId());
			logger.error("Hello");
		});
	}
}
