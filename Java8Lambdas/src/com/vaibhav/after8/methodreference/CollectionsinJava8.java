/**
 * 
 */
package com.vaibhav.after8.methodreference;

import java.util.Arrays;
import java.util.List;

import com.vaibhav.excerise1.Person;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 19, 2017
 */
public class CollectionsinJava8 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mattew", "Arnold", 39));

		System.out.println("Printing with for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.out.println(" \nPrinting with for in loop");
		for (Person p : people) {
			System.out.println(p);
		}

		// the above two are manual logics that do serial processing where as
		// the below are parallel processing that jdk 8 provides out of the box
		
		//forEach takes a Consumer as the parameter
		System.out.println(" \nPrinting with lambda forEach ");
		people.forEach(p -> System.out.println(p));

		System.out.println(" \nPrinting with Method Reference forEach ");
		people.forEach(System.out::println);
	}
}
