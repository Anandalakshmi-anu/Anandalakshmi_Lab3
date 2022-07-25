package com.greatlearning.driver;

import com.greatlearning.utils.FindSumPairs;
import com.greatlearning.utils.FindSumPairs.Node;

public class DriverTree {

	public static void main(String[] args) {
		
		Node rootNode=null;
		
		FindSumPairs findSumPairs = new FindSumPairs();
		rootNode = findSumPairs.insert(rootNode, 40);
		rootNode = findSumPairs.insert(rootNode, 20);
		rootNode = findSumPairs.insert(rootNode, 60);
		rootNode = findSumPairs.insert(rootNode, 10);
		rootNode = findSumPairs.insert(rootNode, 30);
		rootNode = findSumPairs.insert(rootNode, 50);
		rootNode = findSumPairs.insert(rootNode, 70);
		
		int sum=80;
		findSumPairs.findpairWithGivenSum(rootNode, sum);
	}

}
