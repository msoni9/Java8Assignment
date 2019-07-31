package main.java.com.optional;

import java.util.Optional;

public class ProgramMEmpty {

	public static void main(String[] args) {
		String[] str = new String[1];
		
		str[0] = "Geeks classes are coming soon";
		
		Optional<String[]> of = Optional.of(str).empty();
		System.out.println(of.get());
		
//		// It returns an empty instance of Optional class 
//		Optional<String> opt = Optional.empty();
//		System.out.println(opt);
		
		// It returns a non-empty Optional 
		Optional<String> opt1 = Optional.of(str[0]);
		System.out.println(opt1);
		
		
		// It returns value of an Optional. 
        // If value is not present, it throws 
        // an NoSuchElementException 
        System.out.println(opt1.get()); 
  
        // It returns hashCode of the value 
        System.out.println(opt1.hashCode()); 
  
        // It returns true if value is present, 
        // otherwise false 
        System.out.println(opt1.isPresent()); 
		
				

	}

}
