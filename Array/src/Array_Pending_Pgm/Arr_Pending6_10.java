package Array_Pending_Pgm;
/**
6. Split an array- one to store only odd numbers and another to store only even numbers
7. Check if any elements in an array are prime numbers
8. Check if any elements in an array are perfect numbers - HW
9. Print odd elements present in even index of an array
10. Print even elements present in odd index of any array
 */
public class Arr_Pending6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arr_Pending6_10 Arr = new Arr_Pending6_10();
		Arr.Even_Ele_Odd_In();//10
		System.out.println("###########################");
		Arr.Odd_Ele_Even_In();//09
		

	}

	private void Odd_Ele_Even_In() {
		// TODO Auto-generated method stub
		int a[]={10,20,30,40,50,60,70,80,90};
		for (int i = 0; i < a.length; i=i+2) 
		{
			System.out.println("index = "+i+","+"value = "+a[i]);
			if(a[i]%2==0) {
//				System.out.println("Odd Elements In Even Index : ");
//				System.out.println(a[i]+" ");
			}
		}
		
	}
	

	private void Even_Ele_Odd_In() {
		// TODO Auto-generated method stub
		int a[] = {10,21,20,31,40};
		
		for (int i = 1; i < a.length; i+=2) 
		{
			System.out.println("index = "+i+","+"value = "+a[i]);
			if(a[i]%2==0) {
//				System.out.println("Even Elements In Odd Index : ");
//				System.out.println(a[i]+" ");
			}
		}
		
		}
		
		


}
