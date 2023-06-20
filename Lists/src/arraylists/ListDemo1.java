package arraylists;

import java.util.ArrayList;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
	    a.add(10.5f);// boolean
	    a.add(true);
	    a.add(30);
	    a.add(40);
	    
	    ArrayList b = new ArrayList();
	    b.add(50);
	    b.add(60);
	    b.add(70);
	    b.add(80);
	    
	    a.addAll(2, b);
	    System.out.println("After adding b "+ a);
	    
	    ArrayList c = new ArrayList(); 
	    c.addAll(a);
	    c.addAll(b);
	    System.out.println(c);
	    System.out.println(c.contains(600));
	    
	    
	    System.out.println(c.containsAll(b));
	    
	    c.add(3,123);
	    c.add(0,"ABCD");
	    
	    System.out.println("0th Index --> " + c.get(0)); 
	    Object ob = c.get(0); //ABCD
	    Integer i = (Integer)ob; 
	    //Arithmetic Operations: 
	    //+ - * / % 
	    //Type Casting: 
	    System.out.println(i%2==0);
	    
	    c.add(3,123);
	    c.add(0,"ABCD");
	    
	    System.out.println("0th Index --> " + c.get(0)); 
//	    Object ob = c.get(0); //ABCD
//	    Integer i = (Integer)ob; 
	    //Arithmetic Operations: 
	    //+ - * / % 
	    //Type Casting: 
	    System.out.println(i%2==0);
	    
	    

	}

}
