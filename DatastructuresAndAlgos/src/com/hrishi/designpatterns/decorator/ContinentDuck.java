package com.hrishi.designpatterns.decorator;

public class ContinentDuck extends Duck {

	@Override
	void getDescription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void decorate(DuckBehavior duckBehavior) {
		this.duckBehavior = duckBehavior;
	}


}
