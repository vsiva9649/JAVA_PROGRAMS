package Array_Programs;

public class Big_num_Array {

//	 9) Finding biggest no. in given array            
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {10,78,99,99,92}; //
		int highest=marks[0];// h=10,
		for(int i=0;i<marks.length;i++) {//0,1,2,3,4
			if(marks[i]>highest) {//10>10,78>10,99>78 ,99>99,92>99
				highest=marks[i]; //h=78,h=99,
			}
		}
		System.out.println("Highest values is : "+highest);
	}

}
