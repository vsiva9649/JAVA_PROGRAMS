package Array_Programs;

public class Copy_Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		19) Copying the given array to another array in reverse order                   ?
		
		Copy_Array_Reverse cp = new Copy_Array_Reverse();
		
//		cp.Copy_Array();
		cp.Copy_Array_Reverse();

	}

	private void Copy_Array_Reverse() {
		// TODO Auto-generated method stub
		char[] name1= {'S','i','v','a','r','a','m','a','n'};
		char name2[]=new char[name1.length];
		int i=0;int j=name1.length-1;//9-1=8=7
	    for( i=0;i<name1.length;i++)//s
	    {
	      name2[i]=name1[j];//0-n,1-a
	      System.out.print(name2[i]+" ");//n a m a
	      j=j-1;
	      
	    }
		
	}

	private void Copy_Array() {
		// TODO Auto-generated method stub
		char[] name1= {'S','i','v','a','r','a','m','a','n'};
		char name2[]=new char[name1.length];
		for(int i=0;i<name1.length;i++) { //s/i
			int j=0;
			while(j<name1.length) { //0<9.1
				name2[i]=name1[i];// s
			}
		}
		
	}

}
