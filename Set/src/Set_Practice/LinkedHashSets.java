package Set_Practice;

import java.util.LinkedHashSet;

public class LinkedHashSets {
public static void main(String[] args) {
	LinkedHashSet hs = new LinkedHashSet(); 
    hs.add("siva"); 
    hs.add("praveen");
    hs.add("thiyagu");
    hs.add("stalin");
    hs.add("prabakaran");
    hs.add("stalin");
    
    LinkedHashSet hs2 = new LinkedHashSet(); 
    hs2.add(10);
    hs2.add(20);
    hs2.add(45);
    System.out.println(hs2);
    hs2.addAll(hs);
    System.out.println(hs2);
    
    System.out.println(hs);
    
    System.out.println(hs.remove("ashwini"));
    System.out.println(hs);
}
}
