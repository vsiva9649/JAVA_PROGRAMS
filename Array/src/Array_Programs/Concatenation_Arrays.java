package Array_Programs;

public class Concatenation_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30};
		int[] b = {40,50,60};
		int len=a.length+b.length;
		int c[] = new int[len];
		
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[i-a.length];
			}
			System.out.println(c[i]);
		}

	}

}
