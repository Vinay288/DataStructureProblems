package com.bridgelabz.datastructureproblems;

public class PrimeNumbersArrayInsertion {
	private final static int START_NUMBER = 2;
	private final static int END_NUMBER = 1000;
	static int[] palindrome = new int[1000];
	static int palidromeIndex = 0, anagramIndex = 0;
	static int[] anagram = new int[1000];
	static int numberOfPrime = 0;

	public static void main(String[] args) {
		Integer[][] primeNumbersArray = new Integer[100][100];
		Integer[] oneDimensionPrimeNumberArray = new Integer[200];
		int arrayIndex = 0;
		for (int i = START_NUMBER; i <= END_NUMBER; i++) {
			if (isPrime(i)) {
				oneDimensionPrimeNumberArray[arrayIndex++] = i;
				numberOfPrime++;
			}
		}

		int index = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 1; j++) {
				primeNumbersArray[i][j] = oneDimensionPrimeNumberArray[index++];
			}
		}

		for (int i = 1; i < 100; i++) {
			for (int j = 0; j < 1; j++) {
				primeNumbersArray[j][i] = oneDimensionPrimeNumberArray[index++];
			}
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print(primeNumbersArray[i][j] + " ");
			}
			System.out.println(" ");
		}
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
}
