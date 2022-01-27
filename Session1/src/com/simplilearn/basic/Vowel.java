package com.simplilearn.basic;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		System.out.println("enter a character:");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(" is a vowel");
		else
			System.out.println(" is not a vowel");
	}

}
