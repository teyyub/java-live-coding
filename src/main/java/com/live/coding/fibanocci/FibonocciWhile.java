package com.live.coding.fibanocci;

// TODO: 14.02.2022 https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#axzz7KrcgMjmF
/**
 * 1 1 2 3 5 8 13
 * */

public class FibonocciWhile {

    public static void main(String[] args) {

       int a = 0, b =1 , value=10,iterate=1; //1
        while(iterate<=value){
            System.out.print(a + ", ");
            int c = a + b; // 1
            a=b; //2
            b = c; //5
            iterate++;
//            System.out.println(a +" " +b+ " " + c);
        }
    }
}
