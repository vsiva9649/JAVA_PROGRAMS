package String_Practice;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name = new StringBuffer("sivaramakrishnan");
	    // String Buffer is mutable
	    StringBuffer name2 = new StringBuffer(); 
	    for(int i=0; i<name.length();i++)
	    {
	      name2.append(name.charAt(i));// new keyword
	      System.out.println(name2.hashCode());
	    }
	    System.out.println(name2);
	    System.out.println(name.hashCode());
System.out.println(name.reverse());
	}

}
