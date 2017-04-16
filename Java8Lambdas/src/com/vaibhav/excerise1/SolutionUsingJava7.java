/**
 * 
 */
package com.vaibhav.excerise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 16, 2017
 */
public class SolutionUsingJava7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewis","Carroll", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Mattew","Arnold", 39)
				);
		
		//TODO
		
		System.out.println("---> Doing the sort operation---->");
		//Step-1: Sort List by Last Name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		
		//Step-2: Create a method that prints all elements in the list.
		System.out.println("\n" + "---> Doing the printALL operation---->");
		printAll(people);
		
		//Step-3: Create a list of all people that has their last name starting with C
		System.out.println("\n" + "---> Doing the PrintAllLastNameBeginingWithC operation---->");
		PrintAllLastNameBeginingWithC(people);
		
		
		// Step-4: Create a list of all people that has their "first name"
		// starting with c-- this time pass the behavior to the method
		System.out.println("\n" + "---> Doing the PrintAllWithCondition operation---->");
		PrintAllWithCondition(people, new Condition() {
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstName().startsWith("C");
			}
		});
	}



	private static void printAll(List<Person> people) {
		for(Person p: people){
			System.out.println(p);
		}
	}
	
	private static void PrintAllLastNameBeginingWithC(List<Person> people) {
		for(Person p: people){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}
		}
		
	}

	private static void PrintAllWithCondition(List<Person> people, Condition condition) {
		for(Person p: people){
			if(condition.test(p)){
			System.out.println(p);
			}
		}
		
	}
}

interface Condition {
	boolean test(Person p);
}
