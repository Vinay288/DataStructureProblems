package com.bridgelabz.datastructureproblems;

import com.bridgelabz.stackandqueueproblem.MyStack;
import com.bridgelabz.stackandqueueproblem.Node;

public class ParenthesesBalanceChecker {

	public static void main(String[] args) {
		String expression = "()())";
		char[] expressionArray = expression.toCharArray();
		Node<Character> newNode;
		MyStack<Character> myStack = new MyStack<Character>();
		int index = 0;
		for (Character value : expressionArray) {
			if (value.equals('(')) {
				newNode = new Node<Character>(value);
				myStack.push(newNode);
			} else if (!myStack.isEmpty() && value.equals(')')) {
				if (myStack.peek().equals('(')) {
					myStack.pop();
				} else {
					break;
				}
			} else
				break;
			index++;
		}
		if (myStack.isEmpty() && index == expressionArray.length) {
			System.out.println("paraentheses are balanced");
		} else {
			System.out.println("paraentheses are not balanced");
		}

	}

}
