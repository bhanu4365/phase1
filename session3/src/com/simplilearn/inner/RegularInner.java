package com.simplilearn.inner;

public class RegularInner {
	
	public int a=20;
	private String b="Welcome";

			class Inner
			{
		public void display()
		{
			System.out.println("value of a " +a);
			System.out.println("value of b " +b);
		}
			}
	public static void main(String[] args) {
		RegularInner outer=new RegularInner();
		RegularInner.Inner inner=outer.new Inner();
		
		inner.display();
	}
		}
		
