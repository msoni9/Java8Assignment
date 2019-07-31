package main.java.com.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapWorking {
	/*
	 * The Stream.flatMap() function, as name suggests, is the combination of a map and a flat operation. 
	 * This means you first apply map function and than flattens the result. Key difference is the function used by map operation returns 
	 * a Stream of values 
	 * or list of values rather than single value, that's why we need flattening. 
	 * When you flat a Stream of Stream, it gets converted into Stream of values.
		To understand what flattening a stream consists in, consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ] 
		which has "two levels". It's basicall a big List containing three more List.  
		Flattening this means transforming it in a "one level" structure e.g. [ 1,2,3,4,5,6,7,8,9 ] i.e. just one list.

		In short,
		Before flattening - Stream of List of Integer
		After flattening - Stream of Integer

		Here is a code example to understand the flatMap() function better:
		Read more: https://javarevisited.blogspot.com/2016/03/difference-between-map-and-flatmap-in-java8.html#ixzz5v8RAxGWN
	 */

	public static void main(String[] args) {
		List evens = Arrays.asList(2, 4, 6);
		List odds = Arrays.asList(3, 5, 7);
		List primes = Arrays.asList(2, 3, 5, 7, 11);
		
		Object collect = Stream.of(evens, odds, primes).flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("flattend list: " + collect); 
		
		//Output: flattend list: [2, 4, 6, 3, 5, 7, 2, 3, 5, 7, 11]

				

	}

}
