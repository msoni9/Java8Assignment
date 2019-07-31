package main.java.com.methods;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Demo4 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.of(3,4,5);
		OptionalDouble average = intStream.average();
		System.out.println(average);

	}

}
