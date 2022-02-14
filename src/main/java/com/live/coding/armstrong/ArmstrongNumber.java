package com.live.coding.armstrong;

/**
 * 153= 1+ 125+27, which is equal to 1^3+5^3+3^3
 *
 * Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz7Ks1FGWAB
 * */

public class ArmstrongNumber {
    public static void main(String[] args) {
        int a = 1531;
        int b = check(a);
        if(a==b){
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

    static int check(int number){
        int sum = 0, reminder=0;
        while(number>0){
            reminder = number/10;
            sum  = sum + pow3(reminder);
            number = number%10;
            System.out.println(reminder);
            System.out.println(number);
        }
        return sum;
    }

    static int pow3(int a){
        return a*a*a;
    }
}
