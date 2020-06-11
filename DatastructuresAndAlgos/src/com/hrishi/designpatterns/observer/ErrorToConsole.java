package com.hrishi.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ErrorToConsole implements Observer {
	
	private String logMessage;

	@Override
	public void update(Observable arg0, Object log) {
		this.logMessage = (String) log;
		perfomLogging();
	}
	
	public void perfomLogging() {
		System.out.println("Sending this log message to console: " + logMessage);
	}

}
