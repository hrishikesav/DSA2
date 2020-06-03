package com.hrishi.problems;

import java.util.Deque;
import java.util.ArrayDeque;

public class ValidParenthesisString {

	public static void main(String[] args) {
		
		String input = "()";
		System.out.println(checkValidParenthesis(input));
	}
	
	static boolean checkValidParenthesis(String input) {
		if(input == null || input.trim().length() == 0) {
			return true;
		}
		
		Deque<Character> stack = new ArrayDeque<>();
		boolean checkFailed = false;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			switch (ch) {
			case '(':
			case '{':
			case '[':
				stack.push(ch);
				break;
				
			case ')':
				char pop = stack.pop();
				if(pop != '(') {
					checkFailed = true;
				}
				break;
				
			case '}':
				char pop1 = stack.pop();
				if(pop1 != '{') {
					checkFailed = true;
				}
				break;

			case ']':
				char pop2 = stack.pop();
				if(pop2 != '[') {
					checkFailed = true;
				}
				break;
				
			default:
				checkFailed = true;
				break;
			}
			
			if(checkFailed) {
				return false;
			}
		}
		return true;
	}

}
