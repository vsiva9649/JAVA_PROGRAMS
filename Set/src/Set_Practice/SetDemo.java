package Set_Practice;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet<>();
		hs.add("Siva");
		hs.add("Praveen");
		hs.add("Thiyagu");
		hs.add("Prabakaran");
		hs.add("Stalin");

		System.out.println(hs);
		HashSet hs2 = new HashSet(); 
	    hs2.add(10);
	    hs2.add(20);
	    hs2.add(45);
	    System.out.println(hs2);
	    hs2.addAll(hs);
	    System.out.println(hs2);
	    
	    System.out.println(hs);
	    
	    hs.remove("Thiyagu");
	    System.out.println(hs);

	}

}
