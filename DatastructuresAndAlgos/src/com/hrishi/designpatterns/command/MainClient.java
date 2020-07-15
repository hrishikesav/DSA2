package com.hrishi.designpatterns.command;

/*
 * The Command Pattern
 * 
 * Command - TextFileOperation
 * Invoker - TextFileCommandInvoker
 * Receiver- TextFile
 * Client  - MainClient
 * 
 */
public class MainClient {

	public static void main(String[] args) {

		String fileName = "hello.txt";

		TextFileCommandInvoker textFileCommandInvoker = new TextFileCommandInvoker();

		String str1 = textFileCommandInvoker.invokeCommand(new OpenFileOperation(new TextFile(fileName)));
		System.out.println(str1);

		String str2 = textFileCommandInvoker.invokeCommand(() -> "Functionaly saving file " + fileName);
		System.out.println(str2);

		String str3 = textFileCommandInvoker.invokeCommand(new TextFile(fileName)::openFile);
		System.out.println(str3);
	}

}
