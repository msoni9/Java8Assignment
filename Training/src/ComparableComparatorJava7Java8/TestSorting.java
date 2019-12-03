package ComparableComparatorJava7Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "will", "smith", 50);
		Employee e2 = new Employee(3, "mayank", "soni", 27);
		Employee e3 = new Employee(4, "vivek", "more", 28);
		Employee e4 = new Employee(2, "ayush", "sharma", 26);
		Employee e5 = new Employee(5, "suyay", "pande", 29);

		List<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		System.out.println("\n--------------- Un-SortedList------------------------");
		System.out.println(emp);

		System.out.println("\n--------------- SortedList/comparable------------------------");
		Collections.sort(emp);

		System.out.println("\n---------------First name SortedList/Comparator------------------------");
		Collections.sort(emp, new FirstNameSorter());
		System.out.println(emp);

		System.out.println("\n---------------Last nameSortList/Comparator------------------------");
		Collections.sort(emp, new LastNameSorter());
		System.out.println(emp);

		System.out.println("\n---------------AgeSortedList/Comparator------------------------");
		Collections.sort(emp, new AgeSorter());
		System.out.println(emp);

		System.out.println(
				"/** **************************************************************************************************/");

		/**
		 * with java 8
		 */

		/**
		 * Sorting according to natural order
		 */
		emp.stream().sorted();
		// System.out.println(emp);

		/**
		 * Sort according to provided order
		 */

		emp.stream().sorted(Comparator.comparing(Employee::getFirstName));
		// System.out.println(emp);

		/**
		 * sorting according to first name with sort method in java 8
		 * 
		 */

		emp.sort(Comparator.comparing(Employee::getFirstName));
		// System.out.println(emp);

		/**
		 * OR you can use below
		 * 
		 */

		emp.sort(Comparator.comparing(e -> e.getFirstName()));

		// Sort all employees by first name in reverse order

		Comparator<Employee> comparing = Comparator.comparing(Employee::getFirstName);
		emp.sort(comparing.reversed());

		// Sorting on multiple fields; Group by.

		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);
		emp.sort(thenComparing);
		System.out.println(emp);
	}

}
