package com.hrishi.designpatterns.command;

public class OpenFileOperation implements TextFileOperation {

	private TextFile textFile;

	public OpenFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.openFile();
	}

}
