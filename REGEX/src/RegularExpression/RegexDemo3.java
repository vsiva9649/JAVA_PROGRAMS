package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "Chennai is the capital city";
		//space count 
//		  Pattern patternObj = Pattern.compile("\\s");
		  // remove space
		  Pattern patternObj = Pattern.compile("\\S");

		    Matcher matcherObj = patternObj.matcher(password);
		    int count = 0;
		    while(matcherObj.find())
		    {
		      count++;
		      System.out.print(matcherObj.group());
		    }
		    System.out.println(count);

	}

}
