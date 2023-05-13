package Array_demo;
import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo(); 
//	    ad.learn_array1();
//	    ad.learn_array2();
//		ad.calculate_percentage();
//		ad.find_highest();
//		ad.mark();//task1 = (mark task)
		
//		ad.task2(); //Bus story Find_(savings and profits).
//		ad.task3(); //Find out Youtube Avg.timeing
//		ad.task4(); //Ipl Team (Harthick pandia) => avg findout pananum(batblowranrate||etc..)
//		ad.task5(); // (Find out elder age Cricket)
		
		
		
		int[] marks = {92,98,89,99,96};
		ad.find_second_big(marks);
  	

	}
	

		
	private void find_second_big(int[] marks) {
		// TODO Auto-generated method stub
		// Wrapper Class Introduction
		int big = Integer.MIN_VALUE, sbig=Integer.MIN_VALUE;
		int i = 0;
		while(i<marks.length) {
			if(marks[i]>big) {
				sbig=big;
				big=marks[i];
			}
			else if(marks[i]>sbig){
				sbig=marks[i];
			}
			i++;
			
		}
		System.out.println("Biggest value is "+big);
		System.out.println("Second Biggest value is "+sbig);
		
	}



	private void task5() {
		// TODO Auto-generated method stub
		int[] age = {35, 36, 42, 50, 35}; 
		String[] players = {"Virat Kohli", "Rohit Sharma", "MS Dhoni", "Sachin Tendulkar",
        "Ravindra Jadeja"}; 
		int index_h = 0; 

		int highest = age[0]; //highest = 96
		int i=0; 
		while(i<age.length)
		{
		  if(age[i]>highest)
		  {
		    highest = age[i];
		    index_h=i;
		    
		  }
		  i++;
		}
		System.out.println("Highest age is "+ highest +" from "+players[index_h]);
	}
	private void task4() {
		// TODO Auto-generated method stub
		
	}
	private void task3() {
		// TODO Auto-generated method stub
		double[] duration = {3.25, 1.36, 4.20, 5.10, 3.50}; 
		int[] Views = {550,680,708,480,100}; 
		int index_m = 0; 
		int index_v = 0; 

		double highest = duration[0]; //highest = 96
		int i=0; 
		while(i<duration.length) {
			
		}
	}
	private void task2() {
		// TODO Auto-generated method stub
		
		
	}
	private void mark() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// (48,85,79,99,89)
	    int[] marks = {48,85,79,99,89};
	    for (int i = 0; i < marks.length; i++) {  
            System.out.print(marks[i] + " ");  
            int b=marks[i]%10;
			int a=marks[i]/10;
			if(a<b){
				System.out.println("the given number a<b condition satisfied:"+marks[i]);			
				}else {
		         System.out.println("The given no a<b not satisfied ");
			}
			
        }
		
		
	}
	public boolean check() {
		
	 int no = 4;
			int b=no%10;
			int a=no/10;
			
			if(a<b) {
				return true;
//				System.out.println(no);
			}else {
				return false;
//				System.out.println(b);
			}
		}
	private void find_highest() {
		// TODO Auto-generated method stub
		int[] marks = {100, 78, 89, 99, 92}; 
		String[] sub = {"Tamil", "English", "Maths", "Science",
        "Social"}; 
		int index_h = 0; 
		int index_l =0; 	
		int highest = marks[0]; //highest = 96
		int lowest = marks[0];
		int i=1; 
		while(i<marks.length)
		{
		  if(marks[i]>highest)
		  {
		    highest = marks[i];
		    index_h = i;
		  }
		  if(marks[i]<lowest)
		  {
		    lowest = marks[i];
		    index_l = i;
		  }
		  i++;
		}
		System.out.println("Highest mark is "+ highest +" from "+sub[index_h]);
		System.out.println("Lowest mark is "+ lowest+" from "+sub[index_l]);
	}
	private void calculate_percentage() {
	    // TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("How many Subjects? ");
	    int sub_count = sc.nextInt(); //5
	    int[] marks = new int[sub_count];
	    int total = 0; 
	    int i = 0; 
	    while(i<marks.length)
	    {
	      System.out.println("Enter Mark ");
	      marks[i] = sc.nextInt(); 
	      total = total + marks[i];
	      i++; 
	    }
	    System.out.println("Your total is "+ total);
	    float percentage = total/sub_count;
	    System.out.println(percentage);
	  }
	private void learn_array2() {
   	    int[] siva = {100,100,200,300,55,100};

		int i=0;
		while(i<siva.length) 
		{
			if(siva[i]==100) {
   	    System.out.println(siva[i]);
			}
			i++;
		}
//   		System.out.println(nandhini[1]);
//   		System.out.println(nandhini[2]);
//   		System.out.println(nandhini[3]);
//   		System.out.println(nandhini[4]);
//   		System.out.println(nandhini[5]);
//   		System.out.println(nandhini[6]);
   		}

	private void learn_array1() {
	    int[] marks = new int[6];
	    System.out.println(marks[0]);
	    marks[0]=60;
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		System.out.println(marks[6]);

				
				
		
		
	}

}
