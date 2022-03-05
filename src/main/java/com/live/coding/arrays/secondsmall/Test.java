package com.live.coding.arrays.secondsmall;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0,4 ,9 ,11 ,32 ,12};
//        int[] arr = {4 ,9 ,1 ,32 ,12};
//        int[] arr = {9 ,4 ,12 ,6};
        int min = arr[0];
        int min2 = min;
        int length = arr.length;

        for(int i=1;i<length;i++){
            if(arr[i]<min)
                min = arr[i];
        }

        for(int i=0;i<length;i++){
            if( (arr[i]>min )){
                min = arr[i];
                min2 = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(min2);
    }
}
