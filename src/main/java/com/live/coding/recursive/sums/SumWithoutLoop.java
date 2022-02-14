package com.live.coding.recursive.sums;

public class SumWithoutLoop {
    public static void main(String[] args) {
        System.out.println(sum(10q
                0));
    }

    static int sum(int num){
        if (num==0) return 0;
        return num+sum(num-1);
    }
}
