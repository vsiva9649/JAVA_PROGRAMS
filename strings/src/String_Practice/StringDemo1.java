package String_Practice;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo1 sd = new StringDemo1();
		sd.Check_Start();
//		sd.Check_End();
//		String s = "IPL ENDS YESTERDAY";
//	    String[] ss = s.split(" ");
//	    for(int i=0;i<ss.length;i++)
//	      System.out.println(ss[i]);
	    
//		String date = "30/05/2023";
//	    String[] ds = date.split("/");
//	    for(int i=0;i<ds.length;i++)
//	      System.out.println(ds[i]);

	}

	private void Check_End() {
		// TODO Auto-generated method stub
		String name1 = "sivaramakrishnan";
		String name2 = "krishnan";
		boolean ends = true;
		int len1 = name1.length()-1; 
		for(int len2 = name2.length()-1; len2>=0;len2--)
		{
		  if(name1.charAt(len1)== name2.charAt(len2))
		  {
		    len1--;
		    continue; 
		  }
		  else
		  {
		    System.out.println("No, not ends with");
		    ends = false; 
		    break; 
		  }
		}  
		if(ends == true)
		{
		  System.out.println("yes, ends with "+name2);
		}
		
	}

	private void Check_Start() {
		// TODO Auto-generated method stub
		String name1 = "Sivaramakrishnan";
	    String name2 = "siva";
	    boolean starting = true; 
	for(int i=0; i<name2.length();i++)  {  
	    if(name1.charAt(i) == name2.charAt(i))
	    {
	      continue;
	    }
	    else
	    {
	      starting = false; 
	      break; 
	    }
	  }
	  if(starting==true)
	  {
	    System.out.println("yes, " + name1 + " starting with "+name2);
	  }
	  else
	  {
	    System.out.println("Not starting with "+name2);
	  }
		
	}

}
