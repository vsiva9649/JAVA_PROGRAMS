public class May_05 {
    public static void main(String[] args) {
        May_05 lp = new May_05();
        // lp.Swap(10,100);
        lp.Find_binary_to_decimal(101);
        
        
    }

 

    private void Find_binary_to_decimal(int no) {
        int power=0;
        int decimal=0;
        while (no>0) {
            
                int rem = no%10; 
                decimal = decimal + (rem *find_power(2,power)); 
                no = no/10; 
                power = power+1; 
                }
                System.out.println("decimal value is : "+decimal);
            
        
    }



    private void Swap(int no1,int no2) {
        System.out.println("Before Swapping");
        System.out.println(no1+" and "+no2);
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.println("After Swapping");
        System.out.println(no1+" and "+no2);
    }

    private int find_power(int base, int power) { //1,2
        //base 3,power=3
		int box =1;
		while(power>0) { 
			box = box *base;
			power--;
		}
		return box;
}
}