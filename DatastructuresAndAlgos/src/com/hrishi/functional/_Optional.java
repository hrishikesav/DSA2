package com.hrishi.functional;

import java.util.Optional;

public class _Optional {

	public static void main(String[] args) {
		String email = "abc@test.com";
		
		Optional.ofNullable(email).ifPresent(System.out::println);
	}
}
