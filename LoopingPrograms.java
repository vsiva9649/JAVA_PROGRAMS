// 19/Apr/2023 (1 to 12)
/* 
1) 1   1   1   1   1
2) 1   2   3   4   5
3) 1   3   5   7   9
4) 3   6   9   12  15
5) Multiples of 3 and 5
6) Multiples of 3 or 5
7) Divisors_of_given_number
8) Count_of_Divisors_of_given_number
9) Prime_Number
10) Reverse_Printing_a_number
11) Count_of_Digits
12) Sum_of_Digits
13) Reverse_the_number
14) Palindrome
*/
public class LoopingPrograms {
    public static void main(String[] args) {
        LoopingPrograms lp = new LoopingPrograms();
        // lp.onerow();  // 1   1   1   1   1
        // lp.number();  // 1   2   3   4   5 
        // lp.oddnum();  // 1   3   5   7   9
        // lp.thirdnum();// 3   6   9   12  15
        // lp.Divisors_of_given_number(12);
        // lp.Count_of_Divisors_of_given_number();
        // lp.Prime_Number(10);
        // lp.Reverse_Printing_a_number(1234);
        // lp.Count_of_Digits(12345);
        // lp.Sum_of_Digits(1234);
        // lp.Reverse_the_number(123);
         lp.Palindrome(11);
        

    }

    private void Palindrome(int num) {
        int no = num;
        int rev = 0;
        while (num>0) {
            int rem = num % 10;
            rev = (rev*10)+rem;
            num = num /10;
        }

        if(rev == no){
            System.out.println("Given number is Palindrome.");
        }
        else {
            System.out.println("Not a Palindrome.");
        }
    
    }

    private void Reverse_the_number(int no) {
        int reverse=0;
        while (no>0) {
            int rem = no % 10;
            reverse=(reverse*10)+rem;
                    System.out.println("Reverse num is : "+reverse);

            no = no /10;
        }
    }

    private void Sum_of_Digits(int no) {
        int sum = 0;
    while (no>0) {

        sum=sum+(no%10);
        no = no/10;
        
    }
    System.out.println("sum of digits : "+ sum);
    }

    private void Count_of_Digits(int no) {
        int count = 0;
        while (no > 0) {
            System.out.println(no % 10);
            count++;
            no=no/10;
        } 
        System.out.println("count of digits : "+count);
    }

    private void Reverse_Printing_a_number(int num) {
        
        while (num>0) {
            System.out.println(num%10);
            num = num /10;
        }
    }

    private void Prime_Number(int no) {
        int div = 2;
        int count = 0;
        while (div<no) {
            if (no%div == 0) {
                System.out.println(div);
                count++;
            }
            div++;
        }
        if (count == 0){
            System.out.println("given number is prime.");
        }
        else{
            System.out.println("Given number is not a prime.");
        }
    }
    private void Count_of_Divisors_of_given_number() {
        int no = 100;
        int div = 2;
        int count = 0;
        while (div<no) {
            if (no%div == 0) {
                System.out.println(div);
                count++;
            }
            div++;
        }
        System.out.println("Count_of_Divisors_of_given_number is :"+count);
    }

    private void Divisors_of_given_number(int no) {
        int div = 2;
        while (div<=no) {
            if (no%div == 0) {
                System.out.println(div);
            }
            div++;
        }
    }

    private void thirdnum() {
        int no = 3;
        while (no<=15) {
            System.out.print(no+" ");
            no = no+3;
        }
        System.out.println();
    }

    private void oddnum() {
        int no = 1;
        while (no<=10) {
            System.out.print(no+" ");
            no = no+2;
        }
        System.out.println();
    }

    private void number() {
        int no = 1;
        while(no<=5){
        System.out.print(no+" ");
        no++;
        }
    }

    private void onerow() {
        int no=1;
        while (no<=5) {
            System.out.print(1+" ");
            no++;
        }
        System.out.println();

    }
}
