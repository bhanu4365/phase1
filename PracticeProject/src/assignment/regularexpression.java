package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpression {

		public static void main(String[] args) {
			
			String regex="[A-Za-z]+";
			String input="bhanu";
			
			Pattern pattern= Pattern.compile(regex);
			
			Matcher match= pattern.matcher(input);
			
			if(match.matches())
			{
				System.out.println("Pattern Matched");
			}
			else
			{
				System.out.println("invalid input");
			}
		}
	}