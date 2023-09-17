package StringInterview;

import java.util.Scanner;

public class FrdCode {
	public static void main(String[] args) {
		  // TODO Auto-generated method stub

		  Scanner in=new Scanner(System.in);
		  System.out.println("Enter String:");
		  String str=in.nextLine();
		  
		  System.out.println("Before removing Extra Space : "+str);
		  int c=0;
		  
		  while(true)
		  {
		   try 
		   {
		    str.charAt(c);
		    c++;
		   } 
		   catch (Exception e) 
		   {
		    // TODO: handle exception
		    break;
		   }
		  }
		  
		  String strCopy="";
		  boolean ok=false;
		  
		  for(int i=0; i<c; i++)
		  {
		   try 
		   {
		    if(str.charAt(i)!=' ')
		    {
		     strCopy+=str.charAt(i);
		     ok=true;
		    }
		    else
		    {
		     if(ok)
		     {
		      if(str.charAt(i+1)==' ')
		      {
		       continue;
		      }
		      else
		      {
		       strCopy+=str.charAt(i);
		      }
		     }
		    }
		   } 
		   catch (Exception e) 
		   {
		    // TODO: handle exception
		   }

		  }
		  System.out.println("After Removing Extra Space : "+strCopy);
		  System.out.println("Reversed String : "+reverse(strCopy));
		 }

		 static String reverse(String strCopy) {
		  // TODO Auto-generated method stub
		  int c=0;
		  strCopy=strCopy+" ";
		  while(true)
		  {
		   try 
		   {
		    strCopy.charAt(c);
		    c++;
		   } 
		   catch (Exception e) 
		   {
		    // TODO: handle exception
		    break;
		   }
		  }
		  String temp="" , rev="";
		  
		  
		  for(int i=0; i<c; i++)
		  {
		   char ch=strCopy.charAt(i);
		   
		   if(ch!=' ')
		   {
		    temp=temp+ch;
		   }
		   else
		   {
		    rev=temp+" "+rev;
		    temp="";
		   }
		  }
		  return rev;
		 }

		}
