package Learn_String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class concatinationMethods {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
 concatinationMethods n = new concatinationMethods();
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your string");
 String s = sc.nextLine();
  //6Predefined methods 

//     n.concate_(s);//pending
//    n.plusOperator(s);
//    n.format_(s);
//    n.Join_(s);
//    n.JoinerClass(s);
//     n.Collectors_Join();
 
  }

  private void Collectors_Join() {
    // TODO Auto-generated method stub
     List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
        String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  
            System.out.println(str.toString());  //Displays result  
  }

  private void JoinerClass(String s1) {
    // TODO Auto-generated method stub
    StringJoiner s = new StringJoiner("*");   //StringeJoiner object  
        s.add("Hello");    //String 1   
        s.add("World"); 
        s.add(s1);//String 2
        s.add("hhh");
        System.out.println(s.toString());  //Displays result
  }

  private void Join_(String s) {
    // TODO Auto-generated method stub
        String s1 = new String("Hello");    //String 1  
        String s2 = new String(" World");    //String 2  
        String s3 = String.join("",s1,s2);   //String 3 to store the result  
            System.out.println(s3);  //Displays result  
            String message = String.join("*", "Java", "is", "cool");
            // message returned is: "Java-is-cool"
            System.out.println(message);
            
  }
  

  private void format_(String name) {
    // TODO Auto-generated method stub
    
    String sf1=String.format("name is %s",name);  
    String sf2=String.format("value is %f",32.33434);  
    String sf3=String.format("value is %32.3f",32.33);//returns 12 char fractional part filling with 0  
      
    System.out.println(sf1);  
    System.out.println(sf2);  
    System.out.println(sf3);
    
  }

  private void plusOperator(String s) {
    // TODO Auto-generated method stub
    String s1= s+"g";
    System.out.println(s1);
    
  }

  private void concate_(String s) {
    // TODO Auto-generated method stub
    String s2="ashwini";
    StringBuilder s1=new  StringBuilder(123);
    System.out.println(s1.append(s2).toString());
//    System.out.println(s2.concat(s));
  }

}