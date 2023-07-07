package Regex_Tasks;
import java.util.*;
import java.util.regex.Pattern;
public class Regex_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = " ";
		   String input = "Sunday Is Holiday";
		        Pattern patternObj = Pattern.compile(s);
		        String[] items = patternObj.split(input);
		        for(int i=0;i<items.length;i++)
		        {
		        	System.out.print(items[i]);
		        }
		        System.out.println();
		      String output = input.replaceAll("([a-z])([A-Z])", "$1 $2");
		      System.out.println(output);

	}

}
