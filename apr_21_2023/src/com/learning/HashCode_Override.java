package com.learning;

public class HashCode_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashCode_Override s1 = new HashCode_Override(); 
		    HashCode_Override s2 = new HashCode_Override(); 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		  System.out.println(s1.toString());
	}
		  public int hashCode()
		  {
		    return -123;
		  }

	

}
