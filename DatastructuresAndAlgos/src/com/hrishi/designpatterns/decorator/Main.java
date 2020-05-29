package com.hrishi.designpatterns.decorator;

public class Main {

	public static void main(String[] args) {
		Duck duck = new ContinentDuck();
		duck.decorate(new HighFlyBehavior());
 		duck.duckBehavior.behavior();
 		
 		//throw new MyException();
 		
 		//System.out.println(new MyException() instanceof RuntimeException);
	}

}

class MyException extends Throwable {
	
}
