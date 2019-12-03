package main.java.com.collectors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramToMapMain {

	public static void main(String[] args) {

		List<ProgramToMapPerson> list = new ArrayList<>();
		list.add(new ProgramToMapPerson(1, "Will"));
		list.add(new ProgramToMapPerson(2, "Smith"));
		list.add(new ProgramToMapPerson(2, "Smith"));

		/*
		 *  with 2 arguments
		 */
		//Map<Integer, String> collect = list.stream().collect(Collectors.toMap(ProgramToMapPerson::getId, ProgramToMapPerson::getName));

		// with 3 arguments
		LinkedHashMap<Integer, String> collect = list.stream().collect(Collectors.toMap(ProgramToMapPerson::getId, ProgramToMapPerson::getName, (x,y) -> x+", "+y, LinkedHashMap::new)) ;
		collect.forEach((x,y) -> System.out.println("key:" + x + ", value :"+ y));
	}

}
