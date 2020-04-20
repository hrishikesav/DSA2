package com.hrishi.hackerrank.stacksqueue;

import java.util.Deque;
import java.util.LinkedList;

public class BracketMatching {

	public static void main(String[] args) {
		
//		String s = "}][}}(}][))]";
//		String s = "{[()]}";
		String s = "(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]";
		System.out.println(isBalanced(s));
		
	}
	
	static String isBalanced(String s) {
		Deque<Character> deque = new LinkedList<>();
		
		try {
			for(char c : s.toCharArray()) {
				switch(c) {
				case '{':
				case '[':
				case '(':
					deque.addFirst(c);
					break;
				case '}':
					char rem = deque.removeFirst();
					if(rem != '{') {
						return "NO";
					}
					break;
				case ']':
					char rem1 = deque.removeFirst();
					if(rem1 != '[') {
						return "NO";
					}
					break;
				case ')':
					char rem2 = deque.removeFirst();
					if(rem2 != '(') {
						return "NO";
					}
					break;
				}
			}
		}catch(Exception e) {
			return "NO";
		}
		
		return "YES";
	}

}
