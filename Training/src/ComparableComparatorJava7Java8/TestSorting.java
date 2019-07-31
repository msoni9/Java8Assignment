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
		
		System.out.println("\n--------------- Un-Sorted List------------------------");
		System.out.println(emp);
		
		System.out.println("\n--------------- Sorted List/comparable------------------------");
		Collections.sort(emp);
				
		System.out.println("\n---------------First name Sorted List/Comparator------------------------");
		Collections.sort(emp, new FirstNameSorter());
		System.out.println(emp);
		
		System.out.println("\n---------------Last name Sorted List/Comparator------------------------");
		Collections.sort(emp, new LastNameSorter());
		System.out.println(emp);
		
		System.out.println("\n---------------Age Sorted List/Comparator------------------------");
		Collections.sort(emp, new AgeSorter());
		System.out.println(emp);
		
		
	//	************************************************************************************************** //
		
		
		/*
		 * with java 8
		 */
		
		emp.sort(Comparator.comparing(Employee::getFirstName));
		/*
		 * OR you can use below
		 */
		emp.sort(Comparator.comparing(e -> e.getFirstName()));
		
	
		//Sort all employees by first name in reverse order
		Comparator<Employee> comparator = Comparator.comparing(e -> e.getFirstName());
		emp.sort(comparator.reversed());
		 
		//Sorting on multiple fields; Group by.
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
		emp.sort(groupByComparator);
		
		

	}

}
