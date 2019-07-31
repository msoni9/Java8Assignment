package main.java.com.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String args[]){
		List<Employee> emp= new ArrayList<Employee>();
		Employee o= new Employee(1,"will");
		Employee o1= new Employee(2,"smith");
		emp.add(o);
		emp.add(o1);

		// with lamba Expressions
		/*Collections.sort(emp, (E1, E2)->{
			return (E1.getId()> E2.getId() ? 1 :-1);
		}
				);
				
		emp.stream().forEach(System.out::println); */
		
		// with comparing method
		Comparator<Employee> comp = Comparator.comparing(Employee::getId);
		emp.stream().sorted(comp).forEach(System.out::println);
		
		
	}
}

