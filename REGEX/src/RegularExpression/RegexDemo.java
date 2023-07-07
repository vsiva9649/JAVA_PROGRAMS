package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "My mobile number is 9884010000";
//	    Pattern patternObj = Pattern.compile("\\d{10}");
//	    Pattern patternObj = Pattern.compile("[0123456789]");
	    Pattern patternObj = Pattern.compile("[0-9]");
		
	    Matcher matcherObj = patternObj.matcher(input);
	    while(matcherObj.find())
	    {
	      System.out.println(matcherObj.group());
	      System.out.println(matcherObj.start());
	      System.out.println(matcherObj.end());

	    }

	}

}
