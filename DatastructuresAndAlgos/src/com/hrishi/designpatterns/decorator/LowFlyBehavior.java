package com.hrishi.designpatterns.decorator;

public class LowFlyBehavior extends FlyBehavior {

	@Override
	public void behavior() {
		System.out.println("Low fly behavior.");
	}

	@Override
	void getDescription() {
		System.out.println("LowFlyBehavior");
	}

	@Override
	void decorate(DuckBehavior duckBehavior) {
		this.duckBehavior = duckBehavior;
	}

}
