package Set_Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
	    al.add('s');
	    al.add('a');
	    al.add('b');
	    al.add('a');
	    al.add('r');
	    al.add('i');
	    al.add('b');
	    al.add('a');
	    al.add('l');
	    al.add('a');
	    
	  //  System.out.println(al);
	    
	    LinkedHashSet lhs = new LinkedHashSet(); 
	    LinkedHashSet lhs2 = new LinkedHashSet(); 
	    for(Object ob: al)
	    {
	      boolean added = lhs.add(ob);
	      if(added == false)
	      {
//	        System.out.println(ob);
	        lhs2.add(ob);
	      }
	    }
	    System.out.println(lhs2);

	}

}
