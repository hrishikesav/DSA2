package com.hrishi.designpatterns.avoidnestedif;

import com.hrishi.designpatterns.avoidnestedif.command.AddCommand;

public class Main {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		int ans = cal.calculateWithIf(1, 2, "add");
		System.out.println(ans);
		
		System.out.println(cal.calculateWithFactory(5, 4, "sub"));
		
		System.out.println(cal.calculateWithCommand(new AddCommand(3, 4)));
	}

}
