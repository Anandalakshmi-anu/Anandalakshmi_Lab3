package com.greatlearning.utils;

import java.util.Stack;

public class BalancingBrackets {
	public static boolean checkBalancingBrackets(String bracketExpression) {
		Stack<Character> bracketStack= new Stack<Character>();
		for(int i=0;i<bracketExpression.length();i++) {
			char character = bracketExpression.charAt(i);
			
			if(character=='{' || character=='[' || character=='(') {
				bracketStack.push(character);
				continue;
			}
			
			if(bracketStack.isEmpty()) {
				return false;
			}
			
			char topOfStack=bracketStack.pop();
			switch(character) {
			case'}':
				if(topOfStack!='{') {
					return false;
				}
				break;
			case']':
				if(topOfStack!='[') {
					return false;
				}
				break;
			case')':
				if(topOfStack!='(') {
					return false;
				}
				break;
			default:
				return false;
			}
		}
		
		return bracketStack.isEmpty();
	}

}
