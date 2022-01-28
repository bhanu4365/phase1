package com.simplilearn.methods;

public class MethodOverloading {

	int add(int a,int b)
	{
		return a+b;
	}
    int add(int a, int b, int c)
    {
         return a+b;
    }
    float add(float a, float b)
    {
    	return a+b;
    }
    double add(double a,double b)
	{
		return a+b;
	}
    public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		System.out.println("addition of 2 int"+m.add(10,5));
		System.out.println("addition of 2 float"+m.add(20.3f,90.3f));
		System.out.println("Addition of 2 double "+m.add(2.3, 6.7));
	}
    }