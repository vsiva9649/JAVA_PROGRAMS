public class Until_1_digit {
    // @ Siva Developer
    public static void main(String[] args) {
        Until_1_digit sum_1 = new Until_1_digit();
        sum_1.findsum(55);
        
    }

    private void findsum(int no) {
        int sum=0;
        while (no>0) {
            sum=sum+(no%10);
            no=no/10;
        }
        if(sum>9){
            findsum(sum);
        }
        else{
            System.out.println("sum of digits : "+sum);
        }
    }
}
