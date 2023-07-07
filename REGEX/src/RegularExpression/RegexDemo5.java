package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String mobile = "98840128102";
//		//                               [first][sec-last]{count}
//		  Pattern patternObj = Pattern.compile("[6-9][0-9]{9}");
//		    Matcher matcherObj = patternObj.matcher(mobile);
//		    while(matcherObj.find())
//		    {
//		      System.out.print(matcherObj.group());
//		    }
		
		/*
		 * Second method
		 */
		String mobile = "9884012810";
		Pattern patternObj = Pattern.compile("(0|91)?[0-9]{9}");
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }
		

	}

}
