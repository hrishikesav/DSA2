package com.hrishi.designpatterns.command;

public class TextFileCommandInvoker {

	public TextFileCommandInvoker() {
	}

	public String invokeCommand(TextFileOperation textFileOperation) {
		return textFileOperation.execute();
	}

}
