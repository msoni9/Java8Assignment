package main.java.com.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import main.java.com.functionalinterface.Employee;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 List<String> items =
//	                Arrays.asList("apple", "apple", "banana",
//	                        "apple", "orange", "banana", "papaya");
		
		List<Product> product= new ArrayList<Product>();
		Product o= new Product("will", 2, 100);
		Product o1= new Product("smith", 3, 200);
		Product o2 = new Product ("jain", 1, 300);
		Product o3 = new Product ("soni", 1, 300);
		Product o4 = new Product ("soni", 1, 300);
		product.add(o);
		product.add(o1);
		product.add(o2);
		product.add(o3);
		product.add(o4);
		
		
		Map<String, List<Product>> collect = product.stream().collect(Collectors.groupingBy(Product::getName));
		System.out.println(collect);
		
		
		
		 
		 


	}

}
