package com.bridgelabz.datastructureproblems;

import com.bridgelabz.linkedlistproblems.MyNode;
import com.bridgelabz.linkedlistproblems.MySortedLinkedList;

public class InsertionOrDeletionInOrderedList {

	public static void main(String[] args) {

		Integer[] numbers = { 10, 5, 3, 16, 5, 10, 12 };
		MyNode<Integer> newNode;
		MySortedLinkedList<Integer> mySortedLinkedList = new MySortedLinkedList<Integer>();
		for (Integer number : numbers) {
			if (mySortedLinkedList.find(number) == null) {
				newNode = new MyNode<Integer>(number);
				mySortedLinkedList.append(newNode);
				System.out.println(number + " added");
			} else {
				mySortedLinkedList.delete(number);
				System.out.println(number + " deleted");
			}
		}
		mySortedLinkedList.printMyNodes();

	}

}
