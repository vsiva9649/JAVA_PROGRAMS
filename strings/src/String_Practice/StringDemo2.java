package String_Practice;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo2 s = new StringDemo2();
//		s.name1();
//		s.name2();
//		s.name3();
//		s.name4();
//		s.name5();
		s.name6(); // test my frd code
		
		
		

	}

	private void name6() {
		// TODO Auto-generated method stub
		String name1="Siva";
		String name2="siva";
		boolean starts = true;
		for(int i=0;i<name2.length();i++) {
			if(name1.charAt(i)==name2.charAt(i))
			{
//				if(name1.equalsIgnoreCase(name2)) 
//				{
				continue;
				//}
			}
			else {
				starts = false;
				break;
			}
		}
		if(starts==true) {
			System.out.println("Yes, starts with "+name2);
		}
		else {
			System.out.println("No, Not starts with "+name2);

		}
	}

	private void name5() {
		// TODO Auto-generated method stub
		String name = "   amal raj";
	    String name2 = "";
	    boolean alphabet_came = false;
	    char[] ch = name.toCharArray();
//	    name.
	    for(int i=0; i<ch.length;i++)
	    {
	      char letter = ch[i];
	      if (letter==' ' && alphabet_came == false)
	      {
	  
	      }
	      else {
	        alphabet_came = true; 
	      //System.out.print(ch[i]);
	      name2 = name2 + letter; //amal
	      }
	    }
	    System.out.println(name2);
		
	}

	private void name4() {
		// TODO Auto-generated method stub
		String name = "   amal raj ";
	    String name2 = "";
	    char[] ch = name.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	      char letter = ch[i];
	      if (letter==' ')
	      {
	        
	      }
	      else {
	      //System.out.print(ch[i]);
	      name2 = name2 + letter; 
	      }
	    }
	    System.out.println(name2);
		
	}

	private void name3() {
		// TODO Auto-generated method stub
		String name = "Siva Rama Krishnan";
	    //AmAlRaJ
	    //0123456
	    //0  2 4 6 --> Index
	    
	    for(int i=0; i<name.length();i++)
	    {
	      char letter = name.charAt(i);
	      if(letter>='a' && letter<='z')
	      {
	        if(i%2==0)
	          {
	          System.out.print((char)(letter-32));
	          }
	        else
	        {
	          System.out.print(letter);
	        }
	      }
	      else
	      {
	        System.out.print(letter);
	      }
	    }
		
	}

	private void name2() {
		// TODO Auto-generated method stub
		String name = "Siva Rama Krishnan";
	    for(int i=0; i<name.length(); i++)
	    {
	    char letter = name.charAt(i);//letter =S
	    //if the letter is present in between 'a' and 'z':
	    if(letter>='A' && letter<='Z')
	      System.out.print((char)(letter-32));
	    else
	      System.out.print(letter);
	    }
		
	}

	private void name1() {
		// TODO Auto-generated method stub
		String name = "Siva Rama Krishnan";
	    for(int i=0; i<name.length(); i++)
	    {
	    char letter = name.charAt(i);//letter =S
	    //if the letter is present in between 'a' and 'z':
	    if(letter>='A' && letter<='Z')
	      System.out.print((char)(letter+32));
	    else
	      System.out.print(letter);
	    }
		
	}

}
