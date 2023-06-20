package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		  al.add(100);
		  al.add(101);
		  al.add(102);
		  al.add(103);
//		  System.out.println(al);

//		  int[] arr = {100,101,102,103}; 
//		  for(int i=0;i<arr.length;i++)
//		    System.out.println(arr[i]);
		  //enhanced for loop - for each loop
//		  for(int aa: arr)
//		  {
//		    System.out.println(aa);
//		  }
//		  for(Object ob: al) {
//			  System.out.println(ob);
//		  }
		  System.out.println("convert object to int");
		  
//		  for(Object ob:al)
//		  {
//		    //Type Casting
//		    Integer no = (Integer)ob; 
//		    if(no%2==0) {
//		    System.out.println(ob);
//		    }
//		  }
		  ArrayList all = new ArrayList(); 
		  all.add(100);
		  all.add(true);
		  all.add("sabaribala");
		  all.add(103.4f);
		  all.add("siva");
		  all.add(101);
//		  System.out.println(all);
		  for(Object ob:all)
		  {
		    try
		    {
		    Integer no = (Integer)ob; 
//		    System.out.println(no);
		    }
		    catch(ClassCastException cce)
		    {
		      
		  }
		  }
		  
		  
		  ArrayList a = new ArrayList(); 
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40); 
		  
		  ArrayList b = new ArrayList(); 
		  b.add(50);
		  b.add(60);
		  b.add(70);
		  b.add(80); 
		  
		  a.addAll(b);
		  System.out.println(a);
		  a.retainAll(b);
		  System.out.println(a);
		  List c = a.subList(0, 2);
		  System.out.println(c);
		  
	}

}
