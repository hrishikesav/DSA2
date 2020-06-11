package com.hrishi.designpatterns.observer;

import java.util.Observable;

public class ErrorLogging extends Observable {
	
	private String logMessage = "Error has happened in this module.";
	
	void publishLogs() {
		setChanged();
		notifyObservers(logMessage);
	}

}
