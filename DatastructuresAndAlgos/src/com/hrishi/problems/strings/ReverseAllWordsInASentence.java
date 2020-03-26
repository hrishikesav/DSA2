package com.hrishi.problems.strings;

public class ReverseAllWordsInASentence {

	public static void main(String[] args) {
		
		String sentence = "this is that";
		
		String[] strArray = sentence.split(" ");
		
		int i = strArray.length - 1;
		while(i > -1) {
			System.out.print(strArray[i] + " ");
			i--;
		}
	}

}
