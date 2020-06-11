package com.hrishi.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ErrorToEmail implements Observer {
	
	private String logMessage;

	@Override
	public void update(Observable o, Object log) {
		this.logMessage = (String) log;
		perfomLogging();
	}

	public void perfomLogging() {
		System.out.println("Sending this log message to email: " + logMessage);
	}
	
}
