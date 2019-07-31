package main.java.com.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) { // Driver code 
	    
	           
	         // list to save stream of strings 
	         List<String> arr = new ArrayList<>(); 
	           
	         arr.add("geeks"); 
	         arr.add("for"); 
	         arr.add("geeks"); 
	         arr.add("computer"); 
	         arr.add("science"); 
	          
	         Stream<String> str = arr.stream(); 
	         
	         /*
	          * limit method
	          */
	         //Stream<String> limit = str.limit(3);
	         
	         /*
	          * skip method
	          */
	         
	         Stream<String> skip = str.skip(3);
	           
	       
	         //limit.forEach(System.out::println); 
	         skip.forEach(System.out::println);
	     } 

}
