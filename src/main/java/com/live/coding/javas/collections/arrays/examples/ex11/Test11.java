package com.live.coding.javas.collections.arrays.examples.ex11;

import java.util.Arrays;

/**
 * Input : 1, 2, 3, 4, 5
 * Output :5, 4, 3, 2, 1
 * */
public class Test11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int length =arr.length;
        for(int i = 0;i< length;i++){

            int temp = arr[length-i-1];
            System.out.println(temp);
            arr[length-i-1] = arr[i];
            arr[i] = temp;

            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(arr));

    }
}
