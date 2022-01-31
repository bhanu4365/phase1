package com.simplilearn.constructors;


	class Student{	
		  int roll_no;  
		  String name, myclass, gender; 

		   
		   Student(int roll, String nam, String c) {
			roll_no = roll ; 
			name = nam;
			myclass = c;
		  }  	
		
		  void display(){
			System.out.println("My name is "+name+", I study in "+myclass+" class and my roll number is "+roll_no);
		  }	 
		  public static void main(String arg[]){
		
		    Student s1 = new Student(5, "sai", "8th");
		    Student s2 = new Student(5, "kumar", "9th");
		    Student s3 = new Student(5, "ravi", "10th");	
		    
		  
		   	 s1.display();  
		     s2.display();
		     s3.display();  
		  }	      
		} 

