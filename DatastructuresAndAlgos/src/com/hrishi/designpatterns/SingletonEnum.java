package com.hrishi.designpatterns;

/*
 * Enums are inherently serializable.
 * But enum variables does not retain their values when deserialized.
 * Reflection also returns only the same instance.
 */
public enum SingletonEnum {
	
	INSTANCE;
	
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
