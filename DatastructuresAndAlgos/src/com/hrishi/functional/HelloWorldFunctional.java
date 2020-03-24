package com.hrishi.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.hrishi.functional.bean.Gender.*;
import com.hrishi.functional.bean.Person;

public class HelloWorldFunctional {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Bob", MALE));
		people.add(new Person("Rhea", FEMALE));
		people.add(new Person("Max", MALE));
		people.add(new Person("Gini", FEMALE));
		
		// Imperative style to print all females in the list
		List<Person> females = new ArrayList<>();
		for(Person person : people) {
			if(FEMALE.equals(person.getGender())) {
				females.add(person);
			}
		}
		
		System.out.println("Imperative");
		for(Person female : females) {
			System.out.println(female);
		}
		
		System.out.println("\nDeclarative style - 1");
		people.stream().filter(person -> FEMALE.equals(person.getGender())).forEach(System.out::println);
		
		System.out.println("\nDeclarative style - 2");
		List<Person> person2 = people.stream().filter(person -> FEMALE.equals(person.getGender()))
				.collect(Collectors.toList());
		person2.forEach(System.out::println);

		System.out.println("\nDeclarative style - 3");
		Predicate<Person> isFemalePredicate = person -> FEMALE.equals(person.getGender());
		people.stream().filter(isFemalePredicate).forEach(System.out::println);
		
		
	}

}
