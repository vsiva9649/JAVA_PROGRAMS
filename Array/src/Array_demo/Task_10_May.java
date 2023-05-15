package Array_demo;

import java.util.Scanner;

public class Task_10_May {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task_10_May ad = new Task_10_May();
		// finished
//        ad.mark();//task1 = (mark task)
//		ad.task5(); // (Find out elder age Cricket)

//		ad.task3(); //Find out Youtube Avg.timeing
		
		ad.task2(); //Bus story Find_(savings and profits).
//		ad.task4(); //Ipl Team (Harthick pandia) => avg findout pananum(batblowranrate||etc..)
  	

	}
	
	private void task2() {
	    // TODO Auto-generated method stub
	    int cost[] = {30,30};
	    int i = 0;
	    int total = 0;
	    int days =25;
	    while(i<cost.length) 
	    {
	      total = total +cost[i];
	      i++;
	    }
	    int total_amt = days*total;
	    int new_amt = total_amt/2;
	    int profit =  total_amt - new_amt;
	    double percentage = ((double)profit/total_amt)*100;
	    System.out.println("total profit percentage :" + percentage+"%");
	    
	}
	private void task3() { //pending panitay erukan
		// TODO Auto-generated method stub
		double[] duration = {3.25, 1.36, 4.20, 5.10, 3.50}; 
		int[] Views = {550,680,708,480,100}; 
		int index_m = 0; 
		int index_v = 0; 

		double highest = duration[0]; //highest = 96
		
		for(int i=0;i<duration.length;i++) {
			int time = (int)duration[i];
			
			System.out.println("minutes"+time);
			
		}
	}
	
	

	private void task5() { // finished
		// TODO Auto-generated method stub
		int[] age = {35, 36, 42, 50, 35}; 
		String[] players = {"Virat Kohli", "Rohit Sharma", "MS Dhoni", "Sachin Tendulkar",
        "Ravindra Jadeja"}; 
		int index_h = 0; 

		int highest = age[0]; //highest = 35
		int i=0; 
		while(i<age.length) //0<5,1<5,2<5,3<5,4<5
		{
		  if(age[i]>highest) //35>35,36>35,42>36,50>42,35>50
		  {
		    highest = age[i];//36,42,50
		    index_h=i;//1,2,3
		    
		  }
		  i++;
		}
		System.out.println("Highest age is "+ highest +" from "+players[index_h]);
	}
	private void mark() { // simply finished
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// (48,85,79,99,89)
	    int[] marks = {48,85,79,99,89};
	    for (int i = 0; i < marks.length; i++) {  
            System.out.print(marks[i] + " ");  
            int b=marks[i]%10; //8
			int a=marks[i]/10;//4
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
}
