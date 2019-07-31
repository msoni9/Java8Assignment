package main.java.com.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program4 {

	public static void main(String[] args) {
		// creating an Integer stream 
		Stream<Integer> 
		s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 

		/*
		 * with predicate as an argument
		 */
		// Map<Boolean, List<Integer>> map = s.collect(Collectors.partitioningBy(num -> num>3));
		//System.out.println(map);
		
		
		/*
		 * with (predicate, counting) as an argument
		 */
		Map<Boolean, Long> collect = s.collect(Collectors.partitioningBy(num -> (num>3), Collectors.counting()));
		System.out.println(collect);
	}

}
