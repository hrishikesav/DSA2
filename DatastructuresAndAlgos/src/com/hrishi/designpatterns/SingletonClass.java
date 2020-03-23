package com.hrishi.designpatterns;

public class SingletonClass {
	
	/*
	 * transient can be used below to avoid serialization.
	 * After deserialization a new instance will be created, that's why.
	 */
	
	/*
	 * volatile guarantees that the variable value will be read from the main memory
	 * and not from the CPU cache.
	 * Each CPU generally has a separate CPU cache.
	 */
	private static volatile SingletonClass instance = null;
	
	private SingletonClass() {
	}
	
	/*
	 * The following still does not solve during 
	 * 1) Serialization
	 * 2) Reflection
	 */
	public static SingletonClass getInstance() {
		if(instance == null) {
			synchronized (SingletonClass.class) {
				if(instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}

}
