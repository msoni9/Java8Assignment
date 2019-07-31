package main.java.com.functionalinterface;

@FunctionalInterface
interface B {

	public void methodOne();

}
/*
 * Child interface extending parent interface then
 * 
 */
@FunctionalInterface
interface C extends B{
	
}
//class AboutFunctionalInterface implements B{
//
//	@Override
//	public void methodOne() {
//		// TODO Auto-generated method stub
//
//		B i =()->System.out.println("Parent Interface");
//
//	}
//
//}
