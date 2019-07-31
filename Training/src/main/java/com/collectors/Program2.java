package main.java.com.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(3, 4, 5);
		
	Integer orElse = s.collect(Collectors.reducing((integer, integer2) -> integer2 + integer)).orElse(-1);
	System.out.println(orElse);
	}

}
