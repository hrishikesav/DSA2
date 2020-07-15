package com.hrishi.designpatterns.command;

public class TextFile {

	private String fileName;

	public TextFile(String fileName) {
		this.fileName = fileName;
	}

	public String openFile() {
		return "Opening file: " + fileName;
	}

	public String saveFile() {
		return "Saving file: " + fileName;
	}
}
