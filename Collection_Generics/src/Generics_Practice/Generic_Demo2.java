package Generics_Practice;

import java.util.ArrayList;

public class Generic_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<>();
		al.add("Ashwini");
		al.add("Siva");
		al.add("sabari");
		al.add("Praveen");
		// type cast error String to int
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)

	at Collection_Generics/Generics_Practice.Generic_Demo2.main(Generic_Demo2.java:15)

		 */
		
//		al.add(100);
		System.out.println(al);
		

	}

}
