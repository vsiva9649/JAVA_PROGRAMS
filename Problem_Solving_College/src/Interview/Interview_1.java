package Interview;

import java.util.Scanner;

public class Interview_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String n=sc.nextLine();
		int a[]=new int[n.length()];
		 for(int i= 0; i<n.length(); i++)
		  {
		    int count = 1; 
		    char ch = n.charAt(i);
		    for(int j=i+1; j<n.length();j++)
		    {
		      if(ch == n.charAt(j)){
		        a[j] = -1; 
		        count++; 
		      }
		    }
		    if(a[i]!=2)
		    {
		      a[i] = count;
		    }
		    if(a[i]>0) {
		    	if(a[i]%2==0)//c=1,2%2==0
		    System.out.println(ch + " appears for " + a[i] +" times");
		    } 
		}
	}
}