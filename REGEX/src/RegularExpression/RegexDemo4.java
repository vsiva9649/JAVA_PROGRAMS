package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "Chennai 600001";
		// integer numbers
//	    Pattern patternObj = Pattern.compile("\\d");
	    // not a number
	    Pattern patternObj = Pattern.compile("\\D");

	      Matcher matcherObj = patternObj.matcher(password);
	      int count = 0;
	      while(matcherObj.find())
	      {
	        count++;
	        System.out.print(matcherObj.group());
	      }

	}

}
