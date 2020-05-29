package com.hrishi.designpatterns.decorator;

public class HighFlyBehavior extends FlyBehavior {

	@Override
	public void behavior() {
		System.out.println("High fly behavior.");
	}

	@Override
	void getDescription() {
		System.out.println("HighFlyBehavior");
	}

	@Override
	void decorate(DuckBehavior duckBehavior) {
		this.duckBehavior = duckBehavior;
	}

}
