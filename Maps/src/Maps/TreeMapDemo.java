package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap hm = new TreeMap(); 
	    hm.put("Idli", 20);
	    hm.put("Dosai", 30);
	    hm.put("Poori", 30);
	    hm.put("Pongal", 40);
	    hm.put("Dosai", 45);
	    System.out.println(hm.containsKey("Poori"));
	    System.out.println(hm.get("Poori"));
	    System.out.println(hm.keySet());
	    System.out.println(hm.values());
	    System.out.println(hm.entrySet());
	    Set s = hm.entrySet(); 
//	    for(Object ob: s)
//	    {
//	    	Entry entry = (Entry) ob;
//	    	int price= (int)entry.getValue();
//	    	if(price==40)
//	      System.out.println(entry.getKey()); 
//	    }
	    
	    for(Object ob: s)
	    {
	  Entry entry = (Entry) ob; 
	  String item = (String)entry.getKey(); 
	  if(item.equals("Dosai")) {
		    entry.setValue(50);
		    System.out.println(entry.getValue());
	  		}
	    }
	    	

	}

}
