package main.java.com.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramSummarizing {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(3, 4, 5);
		/*
		 * summarizingInt
		 */
		IntSummaryStatistics collect = s.collect(Collectors.summarizingInt(x -> x));
		System.out.println(collect);
		
		/*
		 * specific methods in summarizingInt - getmax, getmin, get count
		 */
		//int max = s.collect(Collectors.summarizingInt(x -> x)).getMax();
		//System.out.println(max);

	}

}
