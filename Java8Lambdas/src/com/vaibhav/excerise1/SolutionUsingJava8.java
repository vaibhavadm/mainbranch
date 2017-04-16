/**
 * 
 */
package com.vaibhav.excerise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 16, 2017
 */
public class SolutionUsingJava8 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewis","Carroll", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mattew","Arnold", 39)
				);
		
		//TODO
		System.out.println("---> Doing the sort operation the Lambda way---->");
		//Step-1: Sort List by Last Name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) );
		
		// Step-2: Create a method that prints all elements in the list.
		System.out.println("\n" + "---> Doing the printALL operation---->");
		//printAll(people);
		//for better code optimization use the below line instead of the above
		PrintAllWithCondition(people, p -> true);
		
		//Step-3: Create a list of all people that has their "last name" starting with c
		System.out.println("\n" + "---> Doing the PrintAllLastNameBeginingWithC operation---->");
		PrintAllWithCondition(people, p -> p.getLastName().startsWith("C"));
		
		// Step-4: Create a list of all people that has their "first name"
		// starting with c-- this time pass the behavior to the method
		System.out.println("\n" + "---> Doing the PrintAllFisrttNameBeginingWithC operation---->");		
		PrintAllWithCondition(people, p -> p.getFirstName().startsWith("C"));		
	}


	/**
	 * @param people
	 * @param condition, already defined in previous class
	 */
	private static void PrintAllWithCondition(List<Person> people, Condition condition) {
		for(Person p: people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
		
	}


	/*private static void printAll(List<Person> people) {
			for(Person p: people){
				System.out.println(p);
			}
		}*/
}
