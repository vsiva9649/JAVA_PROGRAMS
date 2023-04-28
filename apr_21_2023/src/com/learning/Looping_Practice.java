package com.learning;

public class Looping_Practice {
    public static void main(String[] args) {
        Looping_Practice lp= new Looping_Practice();
        // lp.printing_reverse_number(9697);
        // lp.find_count_of_digits(1234);
         lp.find_sum_of_digts(12345);
        // lp.reverse_whole_number(1234);
//        lp.find_palindrome(12321);
    }

    private void find_palindrome(int i) {
        int no=i;
        int reverse=0;
        while (i>0) {
            int rem = i % 10;
            reverse = (reverse*10)+ rem;
            i= i/10;
        }
        
        if(reverse == no){
            System.out.println("Number is a palindrome.");
        }
        else {
            System.out.println("not a palindrome.");
        }

    }

    private void reverse_whole_number(int i) {
        int reverse = 0;
        while (i>0) {
            int rem = i % 10;
            reverse = (reverse*10)+ rem;
            i= i/10;
        }
        System.out.println("Reverse whole number is : "+reverse);
    }

    private void find_sum_of_digts(int i) {
        int sum =0;
        while (i>0) {
            sum=sum+ (i%10);
            i=i/10;
        }
        
        if(sum>9) {
        	find_sum_of_digts(sum);
        }else {
        	System.out.println("sum of Digits : "+sum);
        }
    }

    private void find_count_of_digits(int i) {
        int count = 0;
        while (i>0) {
            count=count+1;
            i = i /10;
        }
        System.out.println("count of digits :"+count);
    }

    private void reverse_number(int cake) {
        while (cake>0) {
            System.out.print(cake % 10 +" ");
            cake= cake / 10;

        }
        System.out.println();
    }
}
