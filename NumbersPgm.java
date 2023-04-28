public class NumbersPgm {
    
    public static void main(String[] args) {
        NumbersPgm lp = new NumbersPgm();
        lp.Armstorng_number(1634);
        // int count= count_of_digits(num);
        // int result =power_of_number();
        
        // lp.power_of_number(3,5);
        // lp.neon_number(9);
        // lp.strong_num();
    }

    private void strong_num() {
    }

    void neon_number(int no) {
        int sum =0;
        
        int sqr=(no*no);
        // System.out.println(sqr);
        while (sqr>0) {
            
            sum=sum+(sqr%10);
            sqr=sqr/10;
        }
        System.out.println("sum value is:"+sum);
        System.out.println("given number is : "+no);
        if (sum == no) {
            
            System.out.println("Given number is neon number.");
        }
        else{
            System.out.println("Given number is not a neon number.");
        }
    }

    void power_of_number(int base,int power) {
        int value =1;
        while (power>0) {
            value = value*base;
            power--;
        }
        System.out.println(value);

    }

    void Armstorng_number(int num,int count) {
       
        
        // int count= count_of_digits(num);
        // int result =power_of_number();

        int sum =0;
        while (num>0) {
            int rem =num%10;
            sum=sum+power_of_number(rem,count);
            num = num/10;
        }
        return sum;

        
    }
    int count_of_digits(int num){
        int count =0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }
}
