package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList(); 
		  a.add(10);
		  a.add(true);
		  a.add(30);
		  a.add("Yogesh Balaji"); 
		  
		  ArrayList b = new ArrayList(); 
		  b.add(50);
		  b.add(60.3f);
		  b.add(false);
		  b.add(80.5); 
		  
		  a.addAll(b);
//		  System.out.println(a);
		  //  [10, 20, 30, 40, 50, 60, 70, 80]
		  a.retainAll(b);
		//  [50, 60, 70, 80]
//		  System.out.println(a);
		  List c = a.subList(0, 2);
//		  System.out.println(c);
		  
		  Object[] ob = a.toArray(); 
		  for(Object val:ob)
		  {
		    System.out.println(val);
		  }

	}

}
