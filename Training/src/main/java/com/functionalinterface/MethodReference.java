package main.java.com.functionalinterface;

import java.util.function.BiFunction;

@FunctionalInterface
interface FuncInterface {

	void draw();

}

//public class MethodReference {
//	
//	/*
//	 * Reference to a static method
//	 */
//
//	public static void test(){
//		System.out.println("Method Reference");
//	}
//	public static void main(String args[]) 
//	{ 
//		// method reference to funcational interface 
//		FuncInterface s = MethodReference::test;
//		s.draw();
//
//	} 
//}

//public class MethodReference {  
//	public static void ThreadStatus(){  
//		System.out.println("Thread is running...");  
//	}  
//	public static void main(String[] args) {  
//		Thread t2=new Thread(MethodReference::ThreadStatus);  
//		t2.start();       
//	} 
//}

