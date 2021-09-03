package com.bridgelabz.datastructureproblems;

import com.bridgelabz.hashtableproblem.MyLinkedHashMap;

public class HashLinkedMapInsertion {

	public static void main(String[] args) {
		String sentence= "To be or to hi not";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<String, Integer>();
		String [] words = sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value = myLinkedHashMap.get(word);
			if(value==null) value=1;
			else value=value+1;
			myLinkedHashMap.add(word, value);	
		}		
		System.out.println(myLinkedHashMap);
	}

}
