package assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class email {
  public static boolean isValidEmail(String email) 
	{		  String regex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";		   
		 // initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();	     
	   }
       public static void main(String[] args)
	 {
	       List<String> emails = new ArrayList<String>();	      
	       // valid email addresses
	       emails.add("bhanu@gmail.com");
	       emails.add("bhanu@yahoo.com");
	       emails.add("bhanu@outlook.me.org");	      
	       //invalid email addresses
	       emails.add("bhanu.gmail.com");
	       emails.add("bhanu..yahoo.com");
	       emails.add("bhau@@com");
	       for (String value : emails) {
	           System.out.println("The Email address: " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }	       
	       System.out.println("Enter any email address to check:");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address: " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));	       
	   }
}