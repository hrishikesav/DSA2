package com.hrishi.functional;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		Supplier<String> getDbUrl = () -> "jdbc://localhost:8978";
		System.out.println(getDbUrl.get());
	}

}
