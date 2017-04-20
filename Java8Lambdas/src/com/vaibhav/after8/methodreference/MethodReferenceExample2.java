/**
 * 
 */
package com.vaibhav.after8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.vaibhav.excerise1.Person;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 19, 2017
 */
public class MethodReferenceExample2 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewis","Carroll", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mattew","Arnold", 39)
				);
		
		
		System.out.println("\n" + "---> Doing the printALL operation---->");
		//for better code optimization use the below line instead of the above
		PrintAllWithCondition(people, p -> true, System.out::println);//p -> System.out.println(p) <====>  System.out::println
	}


	/**
	 * @param people
	 * @param condition, already defined in previous class
	 * Using Consumer interface to pass the behaviour instead of printing sysout inside
	 */
	private static void PrintAllWithCondition(List<Person> people, Predicate<Person> prediacte, Consumer<Person> consumer) {
		for(Person p: people){
			if(prediacte.test(p)){
				//System.out.println(p);	
				consumer.accept(p);
			}
		}
		
	}

}
