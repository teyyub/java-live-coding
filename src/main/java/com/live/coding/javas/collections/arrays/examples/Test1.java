package com.live.coding.javas.collections.arrays.examples;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1,-1,0,2,-2,3,-3,4,5,8,-8} ;
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]+arr[j]==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
