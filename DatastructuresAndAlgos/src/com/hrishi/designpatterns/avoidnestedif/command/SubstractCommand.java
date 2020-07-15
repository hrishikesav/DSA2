package com.hrishi.designpatterns.avoidnestedif.command;

public class SubstractCommand implements Command {
	
	int a,b;
	
	public SubstractCommand(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer execute() {
		return a - b;
	}

}
