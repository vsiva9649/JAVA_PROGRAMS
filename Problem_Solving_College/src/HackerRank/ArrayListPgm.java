package HackerRank;

import java.util.*;

public class ArrayListPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList[] AL=new ArrayList[20000];
		for(int i=0;i<n;i++) {
			AL[i]=new ArrayList();
			int s=sc.nextInt();
			for(int j=0;j<s;j++) {
				int value=sc.nextInt();
				AL[i].add(value);
			}
		}
//		System.out.println();
       // queries
		int q= sc.nextInt();
		for(int i=0;i<q;i++) {
			int row=sc.nextInt();
		    int col=sc.nextInt();
		    try {
			System.out.println(AL[row-1].get(col-1));
		    }
		    catch(Exception e) {
		    	System.out.println("ERROR!");
		    }
		}
	}

}
