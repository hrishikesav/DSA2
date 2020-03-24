package com.hrishi.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.hrishi.functional.bean.Gender;
import com.hrishi.functional.bean.Person;

public class _Consumer {

	public static void main(String[] args) {

		Consumer<Person> greetCustomer = person -> System.out.println("Welcome, " + person.getName());
		greetCustomer.accept(new Person("Ronaldo", Gender.MALE));
		
		BiConsumer<Person, Boolean> greetWithGender = (person, showGender) 
				-> System.out.println(person.getName() + " " + (showGender ? person.getGender() : ""));
		greetWithGender.accept(new Person("Ronaldo", Gender.MALE), true);
	}

}
