package main.java.com.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import main.java.com.functionalinterface.Employee;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StreamImpl> emp= new ArrayList<StreamImpl>();
		StreamImpl o= new StreamImpl(1, 100, "will");
		StreamImpl o1= new StreamImpl(2, 200, "smith");
		StreamImpl o2= new StreamImpl(3, 300, "jain");
		emp.add(o);
		emp.add(o1);
		emp.add(o2);

		/*
		 * collect method
		 */
		IntSummaryStatistics collect = emp.stream().collect(Collectors.summarizingInt(mayank-> mayank.salary));
		System.out.println(collect);

		/*
		 * All Match
		 */
		System.out.println(emp.stream().allMatch(mayank->mayank.salary >= 100));

		/*
		 * Any match
		 */
		System.out.println(emp.stream().anyMatch(mayank -> mayank.salary <=200));

		/*
		 * Stream concat
		 * 
		 */

		Stream<String> s1 ;
		s1 = Stream.concat(Stream.of("Mayank"),Stream.of("Soni"));
		s1.forEach(element ->System.out.println(element));

		/*
		 *  filter findAny() and orElse
		 */

		StreamImpl orElse = emp.stream().filter(element -> "May".equals(element.getName())).findAny().orElse(null);
		System.out.println(orElse);


		// using code conditions with filter
		StreamImpl orElse2 = emp.stream().filter(p -> {
			if("will".equals(p.getName()) && 100 ==p.getSalary())
			{
				return true;
			}
			return false;
			})
				.findAny().orElse(null);
		
		System.out.println(orElse2);
		
		
		// count method
		long count = emp.stream().filter(x-> x.getId() >= 1).count();
		System.out.println("count of employe whose id greater than one =" +count);
		

	}

}
