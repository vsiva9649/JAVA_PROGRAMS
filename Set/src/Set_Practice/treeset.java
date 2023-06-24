package Set_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet hs = new HashSet();
//			hs.add("abcd");
//		    hs.add("bcd");
//		    hs.add("xyz");
//		    hs.add("pqrs");
//		    System.out.println(hs);
//		    TreeSet hs1 = new TreeSet(); 
//		    hs1.add("abcd");
//		    hs1.add("bcd");
//		    hs1.add("xyz");
//		    hs1.add(123);
//		    hs1.add("pqrs");
//		    System.out.println(hs1);
		    // how do you convert arr to arrlist
		    // how do you convert arrlist to array
		    
		    Players mahi = new Players("MSD",100);
		    Players virat = new Players("KOLI",90); 
		    Players rohit = new Players("SHARMA",110);
		    
		ArrayList al = new ArrayList(); 
		al.add(mahi);
		al.add(virat);
		al.add(rohit);
System.out.println(al);

TreeSet ts = new TreeSet(al);
System.out.println(ts);
	}

}
