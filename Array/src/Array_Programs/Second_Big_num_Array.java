package Array_Programs;

public class Second_Big_num_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    find first two big no.in given array
		
		int[] marks= {92,93,89,100,99};
		
		Second_Big_num_Array bn = new Second_Big_num_Array();
		bn.Find_Second_Big_number_in_Array(marks);

	}

	private void Find_Second_Big_number_in_Array(int[] marks) {
		// TODO Auto-generated method stub
		
		int big = Integer.MIN_VALUE,sbig=Integer.MIN_VALUE;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>big) {
				sbig=big;
				big=marks[i];
			}
			else if(marks[i]>sbig){
				sbig=marks[i];
			}
		}
		
		System.out.println("Bigest value in Array : "+big);
		System.out.println("Second Bigest value in Array : "+sbig);
	}

}
