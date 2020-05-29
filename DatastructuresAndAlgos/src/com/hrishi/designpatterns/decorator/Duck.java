package com.hrishi.designpatterns.decorator;

public abstract class Duck {
	
	DuckBehavior duckBehavior;
	abstract void getDescription();
	abstract void decorate(DuckBehavior duckBehavior);
}
