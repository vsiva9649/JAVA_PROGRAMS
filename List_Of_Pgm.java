public class List_Of_Pgm {
    public static void main(String[] args) {
        List_Of_Pgm lp = new List_Of_Pgm();
       //  lp.Print_1_11_121(); // 1*11,11*11,121
        //  lp.Print_1_8_27_64(); // 1^3=1,2^3=8,.....
        // lp.Print_1_4_27_256(); //1^1,2^2,3^3,4^4
        // lp.print_1_4_9_16_25_36_49_64_81_100();
        lp.addition();//n=5, 1+2+3+4+5=15
        // lp.spy(); // sum==mul
        // lp.sum_sigle(10);
        
        

        
    }
    private void sum_single(int no) { //15
        int sum=0;
        while (no>0) {
            sum=sum+(no%10); //0+5=5,5+1=6 
            no=no/10;//1
        }   
        System.out.println("After addition of single digit : "+sum); //6
        }
    private void spy() {
        int no=132;
        int sum = 0;
        int mul=1;
        while (no>0) {
            int rem= no%10;
            sum = sum+rem;
            mul= mul*rem;
            no=no/10;
        }
        if(sum==mul){
        System.out.println("Spy number.");
        }
        else{
            System.out.println("not a spy");
        }
    }
    private void addition() {
        int no=1;
        int sum=0;
        while (no<=10) {
            sum=sum+no;// 
            no++;
        }
        System.out.println("Before additin of n numbers : "+sum);
        
        //1,2,3,4,5 = 15
        while (condition) {
            
        } (sum>9) { //15 > 9
            sum_single(sum);
        }
        


    }
    private void print_1_4_9_16_25_36_49_64_81_100() {
        // 1^2,2^2,3^2,4^2,5^2,6^2,7^2,8^2,9^2,10^10
        int no=1;
        while (no<=10) { //1
            int task=find_power(no, 2);
            System.out.println(task);//1
            no++;
        }
    }
    private int find_power(int base, int power) { //1,2
        //base 3,power=3
		int box =1;
		while(power>0) { //3>0,2>0,1>0
			box = box *base;// 1*3=3,3*3=9,9*3=27,
			power--;//3-1=2,2-1=1,1-1=0
		}
		return box;
	}
    private void Print_1_4_27_256() {
        // 1^1,2^2,3^3,4^4
        int no = 1;
        while (no<=4) {
          int task = find_power(no, no);//1 ,1
            System.out.println(task);
            no++;
        }
    }

    private void Print_1_8_27_64() {
        //1^3=1,2^3=8,3^3=27,4^3=64.
        int no=1;
        int power = 3;
        while (no<=4) { // 1, 2
          int task =find_power(no, power); // 8
          System.out.println(task); //1,8,
          no++;
        }   
    }
    private void Print_1_11_121() {
        int no =1; 
        while (no<=200) { 
            System.out.println(no); //1,11,121
            no=no*11;// 
        }
    }

    
    
}
