/**
 * 
 */
package com.vaibhav.after8.streams;

import java.util.Arrays;
import java.util.List;

import com.vaibhav.excerise1.Person;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 19, 2017
 */
public class StreamsExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewis","Carroll", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mattew","Arnold", 39)
				);
		System.out.println("\nUsing Lambda way");
		people.stream()
		.filter(p->p.getFirstName().startsWith("C"))
		.forEach(p-> System.out.println(p));
		
		System.out.println("\nUsing Method reference way");
		people.stream()
		.filter(p->p.getFirstName().startsWith("C"))
		.forEach(System.out::println);
		
		//A stream has 3 parts 1.) the collection/ packing object that we convert to stream, people 
		//2.)the second step is something like a operation performed on that stream (filter in this case)
		//3.) and the last one is the terminal/end operation (forEach).
		
		System.out.println("\nTesting how terminal operation works");
		long count = people.stream()
		.filter(p->p.getFirstName().startsWith("C"))
		.count();
		System.out.println(count);
		
		System.out.println("\nTesting how parallel operation works");
		//Parallel stream, the compiler splits the processing for faster time.
		people.parallelStream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(System.out::println);
	}
}
