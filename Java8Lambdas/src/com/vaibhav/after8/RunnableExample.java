/**
 * 
 */
package com.vaibhav.after8;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 16, 2017
 */
public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Thread.run() method");

			}
		});
		
		myThread.run();
		
		//If using Lambdas
		Thread myLambdaThread = new Thread(() -> System.out.println("Inside Lamnda.run() method"));
		myLambdaThread.run();
	}
}
