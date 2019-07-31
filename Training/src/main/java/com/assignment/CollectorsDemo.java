package main.java.com.assignment;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 11, 20, 33, 4, 44, 55, 20);
		
		System.out.println("\n (1).---------------------------------------------------------\n ");
		// collect the result of a Stream into Set
		Set<Integer> collect = numbers.stream().collect(Collectors.toSet());
		System.out.println(collect);
		
		System.out.println("\n (2).---------------------------------------------------------\n ");
		// collect the result of a Stream into list
		List<Integer> collect2 = numbers.stream().collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println("\n (3).---------------------------------------------------------\n ");
		// create Map from the elements of Stream (first remove the duplicates)
		Map<Integer, Integer> collect3 = numbers.stream().distinct().collect(Collectors.toMap(Integer::intValue, Integer::intValue));
		System.out.println(collect3);
		
		System.out.println("\n (4).---------------------------------------------------------\n ");
		// find summary statistics from a Stream of numbers
		IntSummaryStatistics collect4 = numbers.stream().collect(Collectors.summarizingInt(x->x));
		System.out.println(collect4);

		System.out.println("\n (5).---------------------------------------------------------\n ");
		// partition the result of Stream in two parts i.e., odd and even
		Map<Boolean, List<Integer>> collect5 = numbers.stream().collect(Collectors.partitioningBy(x -> (x%2 ==0)));
		System.out.println(collect5);
		
		System.out.println("\n (6).---------------------------------------------------------\n ");
		// create comma separated string from numbers
		String collect6 = numbers.stream().map(x -> x.toString()).collect(Collectors.joining(","));
		System.out.println(collect6);


	}
}
