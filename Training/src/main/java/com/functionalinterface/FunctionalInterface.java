package main.java.com.functionalinterface;

@FunctionalInterface
interface FunctionalInterface1 {

	int calculate(int x);

}

class Test 
{ 
	public static void main(String args[]) 
	{ 
		int a = 5; 
		// lambda expression to define the calculate method 
		FunctionalInterface1 s = (int x)->x*x; 

		// parameter passed and return type must be 
		// same as defined in the prototype 
		int ans = s.calculate(a); 
		System.out.println(ans); 

	} 
}