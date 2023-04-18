public class LogicalPrograms {
    public static void main(String[] args) {
        LogicalPrograms lp = new LogicalPrograms();   
        // lp.find_divisors(100);  
        // lp.find_count_of_divisors(120);
        // lp.find_Prime(131);
        lp.find_multiple(2,1);
    }

    private void find_multiple(int no1, int no2) {
        while (no2<=5) {
            System.out.println(no2+" * 2 = "+(no2 * no1));
            no2++;
            
        }
    }

    private void find_Prime(int no) {
        int div =2;
        int count = 0;
        while (div < no) {
            if(no%div == 0){
                System.out.println(div);
                count = count+1;
            }
            div= div+1;
        }
        System.out.println("total divisors count :"+count);
        if(count == 0){
            System.out.println("Given number is prime number.");
        }
        else{
            System.out.println("Given number is not a prime.");
        }
    }

    void find_count_of_divisors(int no) {
        int div =2;
        int count = 0;
        while (div < no) {
            if(no%div == 0){
                System.out.println(div);
                count = count+1;
            }
            div= div+1;
        }
        System.out.println("total divisors count :"+count);
    }

    void find_divisors(int no) {
        int div =2;
        // int count = 0;
        while (div < no) {
            if(no%div == 0){
                System.out.println(div);
            }
            div= div+1;
        }
        // System.out.println("total divisors count :"+count);
    }
}
