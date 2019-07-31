package main.java.com.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee(
				"Yash",
				20,
				new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Employee employee2 = new Employee(
				"Ram",
				20,
				new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Employee employee3 = new Employee(
				"Sita",
				20,
				new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

		System.out.println("\n (1).-------------------------------------------------------\n ");
		// Get employee with exact match name "Yash", if not found print "Not found".
		Optional findAny = employees.stream().filter(x -> "Yash".equals(x.getName())).findAny();
		System.out.println(findAny.isPresent() ? findAny.get() : findAny.orElse("Not Found"));
		
		
		System.out.println("\n (2).-------------------------------------------------------\n ");
		// Get employee with matching address "1235"
		employees.stream().filter(x -> x.getAddress().getZipcode().equals("1235")).forEach(System.out::println);

		System.out.println("\n (3).---------------------------------------------------------\n ");
		// Get all employee having mobile numbers 3333.
		employees.stream().filter(x -> x.getMobileNumbers().contains(new MobileNumber("3333"))).forEach(System.out::println);

		System.out.println("\n (4).---------------------------------------------------------\n ");
		// Convert List<Employee> to List<String> of employee name
		employees.stream().map(x -> x.getName()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("\n (5).---------------------------------------------------------\n ");
		// Collect all the names of employees in a string separated by ||
		String collect = employees.stream().map(x -> x.getName()).collect(Collectors.joining("||"));
		System.out.println(collect);

		System.out.println("\n (6).---------------------------------------------------------\n ");
		// Change the case of List<String>
		employees.stream().map(x -> x.toString().toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("\n (7).---------------------------------------------------------\n ");
		// Sort List<String>
		List<String> collect2 = employees.stream().map(x -> x.toString()).sorted().collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println("\n (8).---------------------------------------------------------\n ");
		// sort List<Employee> based on name
		Comparator<Employee> comp = Comparator.comparing(Employee::getName);
		employees.stream().sorted(comp).forEach(System.out::println);
		
		/*
		 * Read more about Comparator/ Comparable in java 8 and java 7
		 * 
		 * https://howtodoinjava.com/sort/sort-arraylist-objects-comparable-comparator/
		 */
		
		System.out.println("\n (9).---------------------------------------------------------\n ");
		// int[] to string[]
		int[] a2 = {2, 3, 4};
		String[] array2 = Stream.of(a2).map(String::valueOf).toArray(String[]::new);
		String[] array = Arrays.stream(a2).mapToObj(Integer::toString).toArray(String[]::new);
		
		System.out.println("\n (10).---------------------------------------------------------\n ");
		// String[] int List<Integer>
		String[] a1 = {"4", "5", "6"};
		List<Integer> collect3 = Stream.of(a1).map(Integer::parseInt).collect(Collectors.toList());
		collect3.forEach(System.out::print);
		
		
		
		List<String> list123 = new ArrayList<>();
		list123.add("1");
		list123.add("2");
		list123.add("3");

	    Integer[] array123 = list123.stream()
	        .map( v -> Integer.valueOf(v))
	        .toArray(Integer[]::new);
	}
}
