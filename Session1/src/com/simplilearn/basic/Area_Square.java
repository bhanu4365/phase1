package com.simplilearn.basic;


	import java.util.Scanner;
	class Area_Square
	{
	   public static void main (String[] args)
	   {
	       System.out.println("Enter Side of Square:");
	      
	       Scanner sc = new Scanner(System.in);
	      
	       double side = sc.nextDouble();
	      
	       double area = side*side; 
	       System.out.println("Area of Square is: "+area);
	   }
	}
