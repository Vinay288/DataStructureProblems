package com.bridgelabz.datastructureproblems;

import com.bridgelabz.linkedlistproblems.MyLinkedList;
import com.bridgelabz.linkedlistproblems.MyNode;

public class UnOrderedListWordInsertionOrDeletion {

	public static void main(String[] args) {
		String sentence = "aa bb cc dd ee ff gg hh aa bb cc";
		String[] words = sentence.toLowerCase().split(" ");
		MyNode<String> newNode;
		MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
		for (String word : words) {
			if (myLinkedList.find(word) == null) {
				newNode = new MyNode<String>(word);
				myLinkedList.append(newNode);
				System.out.println(word + " added");
			} else {
				myLinkedList.delete(word);
				System.out.println(word + " deleted");
			}
		}
		myLinkedList.printMyNodes();
	}
}
