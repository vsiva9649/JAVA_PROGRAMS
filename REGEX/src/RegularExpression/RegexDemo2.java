package RegularExpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "Chennai is the capital of TamilNadu";
		// end with
//		  Pattern patternObj = Pattern.compile("TamilNadu$");
		//start with
		  Pattern patternObj = Pattern.compile("^Chennai");

		    Matcher matcherObj = patternObj.matcher(password);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }

	}

}
