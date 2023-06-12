package String_Practice;

public class String08_06_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String08_06_2023 s = new String08_06_2023();
//		s.Filter1();
//		s.Filter2();
//		s.Filter3();
//		s.Filter4();
//		s.Filter5();
		s.Filter6();

	}

	private void Filter6() {
		// TODO Auto-generated method stub
		String password = "100";
		  try
		  {
		  int no = Integer.parseInt(password);
		  System.out.println("Yes it contains only numbers");
		  }
		  catch(NumberFormatException nfe)
		  {
		    System.out.println("No it contains other datatypes as well");
		  }
		
	}

	private void Filter5() {
		// TODO Auto-generated method stub
		String password = "100abcd";
		int count =0; 
		  for(int i=0;i<password.length();i++)
		  {
		    char ch = password.charAt(i);
		    if(ch>='0' && ch<='9')
		    {
		      count++; 
		    }
		  }
		  if(count == password.length())
		  {
		    System.out.println("yes all numbers");
		  }
		  else
		  {
		    System.out.println("no other datatypes");
		  }
		
	}

	private void Filter4() {
		// TODO Auto-generated method stub
		String password = "100abcd";
		  //Wrapper Classes: 
		  boolean otherdt = false; 
		  for(int i=0;i<password.length();i++)
		  {
		    char ch = password.charAt(i);
		    if(!(ch>='0' && ch<='9'))
		    {
		      otherdt = true; 
		      System.out.println("No, it contains other datatypes");
		    }
		  }
		  if(otherdt==false)
		  {
		    System.out.println("yes only numbers ");
		  }
		
	}

	private void Filter3() {
		// TODO Auto-generated method stub
		String password = "100";
		  //Wrapper Classes: 
		  int no = Integer.parseInt(password);
		  System.out.println(password+100);//100100
		  System.out.println(no+100); //200
		
	}

	private void Filter2() {
		// TODO Auto-generated method stub
		String email_id = "abcd1234@gmail.com";
		  for(int i=0; i<email_id.length();i++)
		  {
		    char ch = email_id.charAt(i);
		    if(!(ch>='a' && ch<='z') && !(ch>='0' && ch<='9')) 
		      System.out.print(ch);
//		    else if(ch>='0' && ch<='9') {}
//		      //System.out.print(ch);
//		    else
//		      System.out.print(ch);

		  }
		
	}

	private void Filter1() {
		// TODO Auto-generated method stub
		String email_id = "abcd1234@gmail.com";
		  for(int i=0; i<email_id.length();i++)
		  {
		    char ch = email_id.charAt(i);
		    if(ch>='a' && ch<='z')
		    System.out.print(ch);
		  }
	}

}
