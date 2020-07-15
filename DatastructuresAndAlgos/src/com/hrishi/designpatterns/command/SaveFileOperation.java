package com.hrishi.designpatterns.command;

public class SaveFileOperation implements TextFileOperation {

	private TextFile textFile;

	public SaveFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.saveFile();
	}

}
