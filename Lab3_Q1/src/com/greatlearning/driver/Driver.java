package com.greatlearning.driver;

import com.greatlearning.utils.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bracketExpression = "[{()}]";
		
		boolean isBalanced = BalancingBrackets.checkBalancingBrackets(bracketExpression);
		if(isBalanced) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
