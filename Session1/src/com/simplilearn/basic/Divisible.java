package com.simplilearn.basic;

import java.util.Scanner;

public class Divisible
{
	public static void main(String[] args) {
		int num;
		System.out.println("enter a number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		if(num % 5==0)
		
		    System.out.println("Entered number is divisible by 5");
		
		else
			
			System.out.println("Entered number is not divisible by 5");
			
				
	}

}
