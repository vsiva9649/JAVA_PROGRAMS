package Maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapsDemo {
public static void main(String[] args) {
	HashMap menu = new HashMap(); 
    menu.put("Idli", 20);
    menu.put("Dosai", 300);
    menu.put("Poori",  40);
    
    Set s = menu.entrySet();
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
