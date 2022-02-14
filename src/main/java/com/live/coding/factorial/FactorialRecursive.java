package com.live.coding.factorial;

public class FactorialRecursive {
    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int f = fac(3);
        System.out.println("f-> "+f);

    }
    static int fac(int number){
        if (number ==0) return 1 ;
        return number* fac(number-1);
    }
}
