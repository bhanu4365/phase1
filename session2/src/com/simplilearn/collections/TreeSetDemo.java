package com.simplilearn.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		Set<String> set=new TreeSet<String>();
		
		set.add("apple");
		set.add("banana");
		
		set.add("banana");
		set.add("cherry");
		set.add("almond");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("cherry"));
		
		System.out.println(set);
	}
}