/**
 * 
 */
package com.vaibhav.exceptionhandling;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 17, 2017
 */
public class Closure {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// doProcess(a, i->System.out.println(a+b));
		doProcess(a, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i + b);
			}
		});
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}