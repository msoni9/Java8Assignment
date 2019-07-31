package ComparableComparatorJava7Java8;

import java.util.SortedSet;
import java.util.TreeSet;


/*
 * If you have overridden equals() method in your Employee class, always remember to honor its behavior.
 * If two objects are equal using equals() method then compare() method should return ‘0‘.
 * I hope to be clear enough in describing how to sort arraylist of objects.
 * If you still have left with some doubts, leave a comment. I will be happy to resolve.
 * Happy Learning!!
 */

public class SortedSetTest {

	public static void main(String[] args) {

		//SortedSet<Employee> set = new TreeSet<Employee>();

		/*
		 * SortedSet with Comparator
		 */
		SortedSet<Employee> set = new TreeSet<Employee>(new FirstNameSorter());

		Employee e1 = new Employee(1, "will", "smith", 50);
		Employee e2 = new Employee(3, "mayank", "soni", 27);
		Employee e3 = new Employee(4, "vivek", "more", 28);
		Employee e4 = new Employee(2, "ayush", "sharma", 26);
		Employee e5 = new Employee(5, "suyay", "pande", 29);


		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);

		System.out.println(set);

	}

}
