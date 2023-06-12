package String_tasks;

public class String08_06_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String08_06_2023 s = new String08_06_2023();
//		s.Task1();
//		s.Task2();
//		s.Task3();
		

	}

	private void Task3() {
		// TODO Auto-generated method stub
		/*
String s = "a1b2c3"; 

Expected Output: 
aabbbcccc
		 */
		String s = "a1b2c3";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			System.out.print(s.charAt(i));
			}
			else {
				int x= Character.getNumericValue(s.charAt(i));
				for(int j=0;j<x;j++) {
					System.out.print(s.charAt(i-1));
				}

			}
		}
		
	}

	private void Task2() {
		// TODO Auto-generated method stub
		/*
String s = "a3"; 

Expected Output: 
aaaa
		 */
		String s="a3";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			System.out.print(s.charAt(i));
			}
			else {
				int x=Integer.parseInt(String.valueOf(s.charAt(i)));  
				System.out.println(x);
				for(int j=0;j<x;j++)
			      {
			    System.out.print(s.charAt(i-1));
			      }
				
			}
		}
	}

	private void Task1() {
		// TODO Auto-generated method stub
		/*
String[] days = {"mon", "tues", "wednes", "thurs", "fri", "satur"};

Output: 
monday
tuesday
wednesday
thursday
friday
saturday
		 */
		
		String[] days= {"mon","tues","wednes","thurs","fri","satur","sun"};
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]+"day");
		}
	}

}
