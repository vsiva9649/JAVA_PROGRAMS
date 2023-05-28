package Array_Programs;

public class Second_Big_num_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11) Finding first two biggest numbers in a given array
		
		int[] marks= {92,93,89,100,99};//5
		
		Second_Big_num_Array bn = new Second_Big_num_Array();
		bn.Find_Second_Big_number_in_Array(marks);

	}

	private void Find_Second_Big_number_in_Array(int[] marks) {
		// TODO Auto-generated method stub
//		int[] marks= {92,93,89,100,99};//5
		int big = Integer.MIN_VALUE,sbig=Integer.MIN_VALUE;
		for(int i=0;i<marks.length;i++) {//0-92,1-93,2-89,3-89,4-100,5-99
			if(marks[i]>big) { //92>-2147483648,93>92,89>93,100>93,99>100
				sbig=big;//sb=-2147483648,sb=92,sb=93,
				big=marks[i];//b=92,b=93,b=100
			}
			else if(marks[i]>sbig){//89>92,99>93
				sbig=marks[i]; //sb=92, sb=99
			}
		}
		
		System.out.println("Bigest value in Array : "+big);
		System.out.println("Second Bigest value in Array : "+sbig);
	}

}
