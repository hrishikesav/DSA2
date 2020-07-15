package com.hrishi.designpatterns.avoidnestedif.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationFactory {
	
	static Map<String, Operation> map = new HashMap<>();
	
	static {
		map.put("add", new AdditionOperation());
		map.put("sub", new SubtractionOperation());
	}
	
	public static Optional<Operation> getOperation(String operator) {
		return Optional.ofNullable(map.get(operator));
	}

}
