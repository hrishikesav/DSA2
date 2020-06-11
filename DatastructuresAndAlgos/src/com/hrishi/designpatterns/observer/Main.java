package com.hrishi.designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		
		ErrorLogging errorLogging = new ErrorLogging();
		
		ErrorToConsole errorConsole = new ErrorToConsole();
		ErrorToEmail errorEmail = new ErrorToEmail();
		
		errorLogging.addObserver(errorConsole);
		errorLogging.addObserver(errorEmail);
		
		errorLogging.publishLogs();
		
	}

}
