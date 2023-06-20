package arraylists;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList grocery = new ArrayList();
		    grocery.add("shampoo");
		    grocery.add("soap");
		    grocery.add("toothpaste");
		    grocery.add("toothbrush");
		    System.out.println(grocery);
		    
		    ArrayList veg = new ArrayList(); 
		    veg.add("tomato");
		    veg.add("brinjal");
		    veg.add("apple");
		    veg.add("banana");
		    veg.add("tomato");
		    System.out.println(veg);
		    
		    grocery.addAll(veg);
		    System.out.println(grocery);
		    System.out.println(grocery.contains("tomato"));
		    
		    grocery.removeAll(veg);
		    System.out.println(grocery);
		    System.out.println("today 14/06/2000");
		    System.out.println(veg.get(0));
		    
		

	}

}
