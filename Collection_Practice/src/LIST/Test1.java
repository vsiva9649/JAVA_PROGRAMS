package LIST;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list_Str = new ArrayList();
		list_Str.ensureCapacity(20);
		list_Str.add("Apple");
		list_Str.add("Banana");    
		list_Str.add("Cherry");
		list_Str.add("Pineapple");
		list_Str.add("Guava");
		list_Str.add("Papaya");
		list_Str.add("Plum");
		System.out.println(list_Str);
		System.out.println(list_Str.size());
		

	}

}
