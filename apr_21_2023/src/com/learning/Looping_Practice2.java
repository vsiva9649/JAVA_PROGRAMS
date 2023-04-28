package com.learning;

public class Looping_Practice2 {
    public static void main(String[] args) {
        Looping_Practice2 lp=new Looping_Practice2();
        int no=1;
        while(no<=5) {
         int power=lp.find_power(no,no); 
         System.out.println(power);
         no++;
        }
//        lp.dosa();


    }
    private void dosa() {
        int hot_box = 8;
        int count = 3;
        while (count>0) {
            hot_box=hot_box+(hot_box/2);
            count--;
        }
        System.out.println(hot_box);
    }
    int find_power(int base, int power) {
        int box = 1;
        while (power>0) {
            box=box*base;
            power--;
            
        }
        return box;
    }

}
