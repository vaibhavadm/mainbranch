/**
 * 
 */
package com.vaibhav.exceptionhandling;

import java.util.function.BiConsumer;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 17, 2017
 */
public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4, 5 };
		int key = 0;
		performSomething(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void performSomething(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumbers) {
			biConsumer.accept(i, key);
		}
	}

	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (v, k) -> {
			try {
				biConsumer.accept(v, k);
			} catch (ArithmeticException ex) {
				System.out.println("Arithmetic Exception Occured");
			}
		};
	}
}
