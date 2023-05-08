public class First_10_Prime_Numbers {
    public static void main(String[] args) {
        First_10_Prime_Numbers p = new First_10_Prime_Numbers();
        int prime_count=0;
        int no=2;
        while (prime_count<10) {
            boolean result= p.Primeno(no);
            if (result==true) {
                prime_count=prime_count+1;
            }
            no++;
            
        }
            
        
        
    }

    private boolean Primeno(int no) {
        int div=2,count=0;
        while (div<no) {
            if (no%div==0) {
               //  System.out.println(div);
                count++;
            }
            div++;
        }
        if (count==0) {
            System.out.println("This number is a prime number"+no);
            return true;
        } else {
            return false;
        }
    }
}
