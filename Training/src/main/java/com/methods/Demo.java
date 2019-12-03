package main.java.com.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		/*
		 * peek won't work without terminal operation.
		 */
				List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
				list.stream()
				    .peek( System.out::println );

		/*
		 * peet works with terminal operation
		 *
		 */

//		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//		List<Integer> newList = list1.stream()
//				.peek(System.out::println).collect(Collectors.tolist);
//		System.out.println(newList);

	}

}
