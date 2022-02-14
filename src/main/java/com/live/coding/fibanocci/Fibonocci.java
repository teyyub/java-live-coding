package com.live.coding.fibanocci;

// TODO: 14.02.2022 https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#axzz7KrcgMjmF
/**
 * 1 1 2 3 5 8 13
 * */

public class Fibonocci {


    public static void main(String[] args) {

       int a = 1, b =1 ,c = a+b; //2
        for(int i=0;i<5;i++){
            System.out.println(a +" " +b+ " " + c);
            a = b +c; //3
            b = a + c; //5
            c = a+b; // 8
        }
    }
}
