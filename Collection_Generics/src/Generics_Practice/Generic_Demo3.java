package Generics_Practice;

import java.util.*;

public class Generic_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(1,"Siva");  
		map.put(4,"Ashwini");  
		map.put(2,"Praveen");  
		map.put(5, "sabari");
		  
		//Now use Map.Entry for Set and Iterator  
		Set<Map.Entry<Integer,String>> set=map.entrySet();  
		  
		Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry e=itr.next();//no need to typecast  
		System.out.println(e.getKey()+" "+e.getValue());  
		}  


	}

}
