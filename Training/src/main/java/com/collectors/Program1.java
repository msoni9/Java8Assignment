package main.java.com.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program1 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("3", "4", "5"); 

		// using Collectors averagingDouble(ToDoubleFunction mapper) 
		// method to find arithmetic mean of inputs given 
		double ans = s 
				.collect(Collectors 
						.averagingDouble( 
								num -> Double.parseDouble(num))); 

		// displaying the result 
		System.out.println(ans); 
	} 


}
