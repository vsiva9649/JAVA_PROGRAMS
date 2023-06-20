package ClassRoomTasks;

public class ClassTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTasks c = new ClassTasks();
		c.Task1();//Chocolate sum
		c.Task2();//Candy sum
		c.Task3();//Sword sum

	}

	private void Task3() {
		// TODO Auto-generated method stub
		
	}

	private void Task2() {
		// TODO Auto-generated method stub
		int c[]= {1,0,2};
		int candy[]= new int[c.length];
		for(int i=0;i<c.length;i++) {
			if(c[i]>c[i+1]) {
				candy[0]=2;
				
			}
		}
		
		
	}

	private void Task1() {
		// TODO Auto-generated method stub
		 int eaten=15;
		    int cover=eaten;
		    int balance_cover=0;
		    int chocolates=0;
		    while(cover>=2)
		    {
		    chocolates=cover/3;
		    balance_cover=balance_cover+cover%3;
		    //System.out.println(balance_cover);
		    //System.out.println(chocolates);
		    cover=chocolates;
		    eaten=eaten+chocolates;
		    //System.out.println(cover);
		    //System.out.println(eaten);
		    
		    }
		    //System.out.println(eaten);
		  balance_cover=balance_cover+cover;
		  chocolates=balance_cover/3;
		  eaten=eaten+chocolates;
		  System.out.println("Total eaten chocolates "+eaten);
		  
	}

}
