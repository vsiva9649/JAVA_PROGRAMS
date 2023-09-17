package Learn_String;

import java.util.Arrays;
import java.util.Scanner;

public class SubString_Methods {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter your string");
    String input = sc.nextLine();
    SubString_Methods s = new SubString_Methods();
//    s.substring_(input);
//    s.split_method();
  }

  private void split_method() {
    // TODO Auto-generated method stub
    String text= new String("Hello My name is Sachin");  
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split("\\s");  
//        System.out.println(Arrays.toString(sentences)); 
        for (String string : sentences) {
      System.out.println(string);
    }
  }

  private void substring_(String input) {
    // TODO Auto-generated method stub
    System.out.println(input.substring(5));//start index
    System.out.println(input.substring(3, 6));//startIndex: inclusive- endIndex: exclusive


  }

}