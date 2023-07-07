package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abcd1234@gmail.com";
		//[^] not
		Pattern patternObj = Pattern.compile("[^A-Z a-z 0-9]");
		Matcher matcherObj = patternObj.matcher(input);
		while(matcherObj.find())
		{
		  System.out.print(matcherObj.group());

		}

	}

}
