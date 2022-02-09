package assignment;

public class TryCatch {
		  public static void main(String[ ] args) {
		    try {
		      int[] myNumbers = {1,5,7,3,9,6,23,43,67,22,45,12};
		      System.out.println(myNumbers[25]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
		  }
		}

