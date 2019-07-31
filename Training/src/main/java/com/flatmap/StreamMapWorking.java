package main.java.com.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapWorking {
	/*
	 * The Stream.map() function performs map functional operation i.e. 
	 * it take a Stream and transform it to another Stream. 
	 * It applies a function on each element of Stream and store return value into new Stream. 
	 * This way you can transform a Stream of String into a Stream of Integer where Integer could be 
	 * length of String if you supply the length() function. 
	 * This is a very powerful function which is very helpful while dealing with collection in Java.
	 * 
	 *	Here is an example of Stream.map() in Java 8:
	 */

	public static void main(String[] args) {
		List listOfIntegers = Stream.of("1", "2", "3", "4")
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println(listOfIntegers);

	}

	/*
	 * n this example, we have a Stream of String values which represent numbers,
	 * by using map() function we have converted this Stream to Stream of Integers.
	 * How? by appling Integer.valueOf() on each element of Stream. 
	 * That's how "1" converted to intger 1 and so on.
	 * Once transformation is done, 
	 * we have collected the result into a List by converting Stream to List using Collectors.

	 * Read more: https://javarevisited.blogspot.com/2016/03/difference-between-map-and-flatmap-in-java8.html#ixzz5v8S9iXY7
	 */

}
