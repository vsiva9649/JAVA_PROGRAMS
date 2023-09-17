package StringInterview;

import java.util.Iterator;
import java.util.Scanner;

public class Rev_Sentence_Remove_Sp {

	public static void main(String[] args) {
		// input: ____hello____welcome___Siva
	   // output:Siva welcome hello
		Rev_Sentence_Remove_Sp l = new Rev_Sentence_Remove_Sp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String :");
		String input=sc.nextLine();
		System.out.println("Sample input is :\n"+input);
//		l.RemoveSpace();
//		l.ReverseSentence();
		int len=0;
		char[] c = input.toCharArray();
		for (char d : c) {
			len++;
		}		
		System.out.println(len);
		String s="";
		boolean b=false;
		for (int i = 0; i < len; i++) {
			char d = c[i];
			System.out.print(d);
		}

	}

}
