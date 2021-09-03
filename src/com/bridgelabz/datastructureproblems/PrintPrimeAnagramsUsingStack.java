package com.bridgelabz.datastructureproblems;

import java.util.Arrays;

import com.bridgelabz.stackandqueueproblem.MyStack;
import com.bridgelabz.stackandqueueproblem.Node;

public class PrintPrimeAnagramsUsingStack {
	private final static int START_NUMBER = 2;
	private final static int END_NUMBER = 1000;

	public static void main(String[] args) {
		Integer[] primeNumberArray = new Integer[200];
		int arrayIndex = 0;
		for (int i = START_NUMBER; i <= END_NUMBER; i++) {
			if (isPrime(i)) {
				primeNumberArray[arrayIndex++] = i;
			}
		}
		Node<Integer> firstNode, secondNode;
		MyStack<Integer> myStack = new MyStack<Integer>();
		for (int i = 0; i < arrayIndex - 2; i++) {
			for (int j = i + 1; j < arrayIndex - 1; j++) {
				if (isAnagram(primeNumberArray[i] + "", primeNumberArray[j] + "")) {
					myStack.push(new Node<Integer>(primeNumberArray[i]));
					myStack.push(new Node<Integer>(primeNumberArray[j]));

				}
			}
		}
		myStack.popAll();

	}

	public static boolean isPrime(int number) {
		int factors = 0;
		for (int j = 2; j <= Math.sqrt(number); j++) {
			if ((number % j) == 0) {
				factors++;
				break;
			} else
				continue;
		}
		if (factors == 0) {
			return true;
		}
		return false;
	}

	static boolean isAnagram(String number1, String number2) {

		char[] num1 = number1.toString().toCharArray();
		char[] num2 = number2.toString().toCharArray();
		Arrays.sort(num1);
		Arrays.sort(num2);
		num1.toString();
		num2.toString();
		if ((new String(num1)).equals(new String(num2)))
			return true;
		else
			return false;
	}

}
