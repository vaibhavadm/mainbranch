/**
 * 
 */
package com.vaibhav.after8;


/**
 * @author VAIBHAVREDDYGUDDETI Apr 12, 2017
 */
public class Greeter {

	public static void main(String[] args) {
		//using lamda we dont have to create a implementation class again
		IGreeting blockOfCodeFunction = () -> System.out.print("Hello World from java-8");
		blockOfCodeFunction.greet();
		
		//Anonymous Inner class is a class inside an another class with out a name "anonymous"
		IGreeting ananymousInnerClass = new IGreeting() {
			
			@Override
			public void greet() {
				System.out.println("\n"+ "Hello World from Anonymous Inner class.");
				
			}
		};
		
		ananymousInnerClass.greet();
	}
}
