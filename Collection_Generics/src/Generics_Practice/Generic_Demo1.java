package Generics_Practice;

import java.util.ArrayList;

public class Generic_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ArrayList<Integer> al = new ArrayList<Integer>();
				    al.add(10);
				    al.add(20);
				    // type cast exception int to String
//				    al.add("100");
				    al.add(30);
					ArrayList<Integer> ald = new ArrayList<Integer>();
				    ald.addAll(al);

				int total = 0; 
				    for(Object ob:al)
				    {
				      total = total + (int) ob;
				    }
				    System.out.println(total);

	}

}
