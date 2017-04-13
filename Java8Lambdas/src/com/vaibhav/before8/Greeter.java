/**
 * 
 */
package com.vaibhav.before8;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 12, 2017
 */
public class Greeter {
	public void greet(IGreeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		// greeter.greet();
		HelloWorldImp helloWorldImp = new HelloWorldImp();
		greeter.greet(helloWorldImp);
	}
}
