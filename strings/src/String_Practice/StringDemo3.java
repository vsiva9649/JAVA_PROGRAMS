package String_Practice;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo3 s = new StringDemo3();
		s.FindEachLetterCounts();

	}

	private void FindEachLetterCounts() {
		// TODO Auto-generated method stub
		String n = "sivaramakrishnan";
	    int[] cc = new int[n.length()];
	    
	  for(int j = 0; j<n.length(); j++)
	  {
	    int count = 1; 
	    char ch = n.charAt(j);
	    for(int i=j+1; i<n.length();i++)
	    {
	      if(ch == n.charAt(i))
	      {
	        cc[i] = -1; 
	        count++; 
	      }
	    }
	    if(cc[j]!=-1) 
	    {
	      cc[j] = count;
	    }
	    if(cc[j]>0) {
	    System.out.println(ch + " appears for " + cc[j] + 
	        " times");
	    }

	  }
	    
	}

}
