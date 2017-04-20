/**
 * 
 */
package com.vaibhav.after8.methodreference;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 19, 2017
 */
public class MethodReferenceExample1 {
	public static void printMessage() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// regular way
		printMessage();
		// using Lambda expression way
		Thread lambdaThread = new Thread(() -> printMessage());
		lambdaThread.start();
		// using Method Reference way
		Thread methodThread = new Thread(MethodReferenceExample1::printMessage);
		methodThread.start();
		// MethodReferenceExample1::printMessage <==Exactly same as==> () ->
		// printMessage()
	}
}
