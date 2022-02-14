package com.live.coding.factorial;

public class Factorial {
    public static void main(String[] args) {
//        2!=2*1;
//        3!=3*2*1;
//        4!=4*3*2*1
         StringBuilder builder = new StringBuilder();
        int factorial =1;
        int sum = 0;
        for(int i =1;i<=4;i++){
            factorial =factorial *i;
//            sum = sum + factorial;
            if(i!=4)
            {
                builder.append(i).append("*");
            }
            else {
                builder.append(i);
            }
        }
        System.out.println(factorial + " = " +builder);



    }

}
