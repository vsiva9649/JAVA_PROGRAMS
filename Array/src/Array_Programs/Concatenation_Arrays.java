package Array_Programs;

public class Concatenation_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		21) Concatenation of two integer arrays
		
		int[] a = {10,20,30};
		int[] b = {40,50,60};
		int len=a.length+b.length;
		int c[] = new int[len];
		
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {//0<3,1<3,2<3,3<3,4<3,5<3,6<3
				c[i]=a[i];//c=10,c=20,c=30
			}
			else {                 //3<3,4<3,5<3,6<3
				c[i]=b[i-a.length];//c=3,b=(3-3)=>0,c=4,b=(4-3)=>1,c=5,b=(5-3)=>2,c=6,b=(6-3)=>3,
			}						// 40,50,60,
		}
		for(int j=0;j<c.length;j++) {
		System.out.println(c[j]);
		}


	}

}
