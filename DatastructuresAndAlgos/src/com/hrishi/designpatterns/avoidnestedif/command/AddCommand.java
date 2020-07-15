package com.hrishi.designpatterns.avoidnestedif.command;

public class AddCommand implements Command {

	int a,b;
	
	public AddCommand(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public Integer execute() {
		return a + b;
	}

}
