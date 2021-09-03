package com.bridgelabz.datastructureproblems;

import com.bridgelabz.stackandqueueproblem.MyQueue;
import com.bridgelabz.stackandqueueproblem.Node;

public class PallidromeChecker {

	public static void main(String[] args) {
		String word = "radarrr";
		char[] wordArray = word.toCharArray();
		Node<Character> newNode;
		MyQueue<Character> myQueue = new MyQueue<Character>();
		for (Character character : wordArray) {
			newNode = new Node<Character>(character);
			myQueue.addRear(newNode);
		}
		myQueue.printMyNodes();
		boolean stillEqual = true;

		while (!myQueue.isEmpty() && stillEqual) {
			char frontChar = myQueue.removeFront();
			System.out.println(frontChar);
			if (myQueue.isEmpty()) {
				break;
			}

			char rearChar = myQueue.removeRear();
			System.out.println(rearChar);
			if (frontChar != rearChar) {
				stillEqual = false;
			}
		}
		System.out.println(stillEqual == true ? word + " is palindrome" : word + " is not palindrome");

	}

}
