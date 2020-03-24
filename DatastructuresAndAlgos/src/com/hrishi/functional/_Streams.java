package com.hrishi.functional;

import static com.hrishi.functional.bean.Gender.FEMALE;
import static com.hrishi.functional.bean.Gender.MALE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hrishi.functional.bean.Person;

public class _Streams {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Bob", MALE));
		people.add(new Person("Rhea", FEMALE));
		people.add(new Person("Max", MALE));
		people.add(new Person("Gini", FEMALE));
		
		people.stream().map(person -> person.getGender()) // return all the genders, now the stream consists only genders
					.collect(Collectors.toSet())		  // reduces the list by removing duplicates.
					.forEach(System.out::println);        // Prints MALE FEMALE
		
		people.stream().map(person -> person.getName()) // return all the names, now the stream consists only names
					.collect(Collectors.toSet())		  // reduces the list by removing duplicates.
					.forEach(System.out::println);        // Prints all the names
		
		people.stream().map(person -> person.getName()) 
					.mapToInt(String::length)		  
					.forEach(System.out::println);        // Prints length of each name
	}

}
