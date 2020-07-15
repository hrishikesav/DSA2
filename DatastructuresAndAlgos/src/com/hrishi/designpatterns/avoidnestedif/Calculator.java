package com.hrishi.designpatterns.avoidnestedif;

import com.hrishi.designpatterns.avoidnestedif.command.Command;
import com.hrishi.designpatterns.avoidnestedif.factory.Operation;
import com.hrishi.designpatterns.avoidnestedif.factory.OperationFactory;

public class Calculator {
	public int calculateWithIf(int a, int b, String op) {
		if ("add".equalsIgnoreCase(op)) {
			return a + b;
		} else if ("sub".equalsIgnoreCase(op)) {
			return a - b;
		} else {
			return Integer.MIN_VALUE;
		}
	}
	
	public int calculateWithFactory(int a, int b, String op) {
		Operation operation = OperationFactory
				.getOperation(op)
				.orElseThrow(() -> new IllegalArgumentException(op + " - operation is not defined"));
		return operation.apply(a, b);
	}
	
	public int calculateWithCommand(Command command) {
		return command.execute();
	}
}
