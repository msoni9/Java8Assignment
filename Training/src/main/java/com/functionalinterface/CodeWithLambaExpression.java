package main.java.com.functionalinterface;

interface inter{
	public void methodOne();
		
	
}
public class CodeWithLambaExpression {

	public static void main(String[] args) {
		inter i = () -> System.out.println("MethodOne Execution");
		i.methodOne();

	}

}
