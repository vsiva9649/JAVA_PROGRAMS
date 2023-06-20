package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add("priyanka");
	    al.add("ashwini");
	    al.add("balaji");
	    al.add("jayasurya");
	    System.out.println(al);
	  //Class Cast Exception  
	    Collections.sort(al);
	  int result = Collections.binarySearch(al, "balaji");
	    System.out.println(result);
	    System.out.println(al);

	}

}
