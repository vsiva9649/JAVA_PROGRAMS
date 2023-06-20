package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList marks = new ArrayList(); 
//Interview question
//		  Scanner sc = new Scanner(System.in); 
//		    while(true)
//		    {
//		      System.out.println("Enter mark: ");
//		    int mark = sc.nextInt(); 
//		    marks.add(mark); 
//		    System.out.println("Enter N to stop"); 
//		    char ch = sc.next().charAt(0); 
//		    if(ch =='N')
//		        break; 
//		    }
		
		Scanner sc = new Scanner(System.in); 
		int i=0;
		int total=0;
	    while(true)
	    {
	      System.out.println("Enter mark: ");
	    int mark = sc.nextInt(); 
	    marks.add(mark); 
//	    System.out.println(marks.get(i));
	    total = total + (int) marks.get(i);
	    i++;
	    System.out.println("Enter 'STOP' to stop"); 
	    String ch = sc.next();
	    if(ch.equalsIgnoreCase("STOP"))
	        break;
	    }
	    System.out.println(total);
	}

}
