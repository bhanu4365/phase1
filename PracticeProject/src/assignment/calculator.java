package assignment;
	import java.util.Scanner;
	public class calculator {
	  public static void main(String[] args)
	  {
		  double num1;
	      double num2;
	      double ans;
	      char op;
	      System.out.print("Enter two numbers: ");
	      Scanner sc = new Scanner(System.in);
	      num1 = sc.nextDouble();
	      num2 = sc.nextDouble();
	      System.out.print("Enter an operator (+, -, *, /): ");
	      op = sc.next().charAt(0);
	      switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Enter correct operator");
	         return;
	      }
	      System.out.print("The final result is: ");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	   }
}
