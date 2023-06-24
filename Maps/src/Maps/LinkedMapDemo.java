package Maps;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm = new LinkedHashMap(); 
	    System.out.println(hm);
	String name = "sivaramakrishnan";
	for(int i=0; i<name.length();i++)
	{
	  if(hm.containsKey(name.charAt(i)))
	  {
	    int count = (Integer)hm.get(name.charAt(i));
	    hm.put(name.charAt(i),count+1);
	 
	  }
	  else
	  {
	    hm.put(name.charAt(i),1);
	  }
	}
	    System.out.println(hm);
	    System.out.println(hm.keySet()+"\n"+hm.values());
	    System.out.println(hm.containsKey('a')+" "+hm.get('a'));
	    System.out.println(hm.entrySet());
	    Set s = hm.entrySet();
	    int max = 0; 
	    Object obj=""; 
	    for(Object ob: s)
	    {
	      Entry entry = (Entry) ob;
	      System.out.println(entry.getKey() + " -> "+ entry.getValue());
	      if((int)entry.getValue()>max)
	      {
	        max = (int) entry.getValue(); 
	        obj = entry.getKey();
	        
	        
	      }
	    }
	    System.out.println(max + " price is for "+ obj);
	
	}

}
