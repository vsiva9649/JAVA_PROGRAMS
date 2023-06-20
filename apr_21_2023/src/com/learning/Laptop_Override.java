package com.learning;

public class Laptop_Override {
	int price; 
	  
	  public Laptop_Override(int price) {
	    // TODO Auto-generated constructor stub
	    this.price = price; 
	  }
	public static void main(String[] args)
	  {
	    Laptop_Override lap1 = new Laptop_Override(25000); 
	    Laptop_Override lap2 = new Laptop_Override(25000); 
	    System.out.println(lap1.equals(lap2)); 
	  }
	  public boolean equals(Object ob)
	  {
	    System.out.println(this.price);//lap1
	    Laptop_Override ll = (Laptop_Override) ob; 
	    System.out.println(ll.price);// lap2
	    if(this.price==ll.price)
	        return true; 
	    else
	        return false; 
	  
	  }
}
