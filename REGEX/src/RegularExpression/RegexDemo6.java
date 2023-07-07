package RegularExpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pa = "-";
	       String input = "28-March-2023";
	            Pattern patternObj = Pattern.compile(pa);
	            String[] items = patternObj.split(input);
	            int count=0;
	            for(int i=0;i<items.length;i++)
	            {
	              System.out.println(items[i]);
	              count++;
	            }
	            System.out.println(count);

	}

}
