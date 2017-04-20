/**
 * 
 */
package com.vaibhav.exceptionhandling;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 19, 2017
 */
public class ThisReference {
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(20, i -> {
			System.out.println(this); // this works here because the lambda
										// points to the instance thats calling
										// this method.
		});

	}

	public static void main(String[] args) {
		ThisReference thisRefBeforeJava7 = new ThisReference();
		thisRefBeforeJava7.doProcess(10, new Process() {
			public void process(int i) {
				System.out.println("value of i is: " + i);
				System.out.println(this);// In Anonymous inner class this
											// Reference overrides the this
											// reference of the class
			}

			public String toString() {
				return "This is the Annonymous Inner class instance";
			}

		});

		ThisReference thisReferenceinJava8 = new ThisReference();
		thisReferenceinJava8.doProcess(20, i -> {
			System.out.println("The value of i is: " + i);
			// System.out.println(this); this does not work inside this lambda
			// expression because the instance of the lambda cannot touch this
			// reference.
			thisReferenceinJava8.execute();
		});

	}

	public String toString() {
		return "This is the main 'ThisReference' class instance";
	}
}
