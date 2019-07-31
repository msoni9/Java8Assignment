package main.java.com.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std = new Student();
		std.setName("mkyong");;
        std.addBook("Java 8 in Action");
        std.addBook("Spring Boot in Action");
        std.addBook("Effective Java (2nd Edition)");

        Student std2 = new Student();
        std2.setName("zilap");
        std2.addBook("Learning Python, 5th Edition");
        std2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(std);
        list.add(std2);
        
        List<String> collect = list.stream().map(x -> x.getBook()).flatMap(x -> x.stream()).distinct().collect(Collectors.toList());
        
        collect.forEach(x -> System.out.print(x));

	}

}
