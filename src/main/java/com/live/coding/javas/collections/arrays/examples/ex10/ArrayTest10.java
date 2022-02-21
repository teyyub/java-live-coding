package com.live.coding.javas.collections.arrays.examples.ex10;

/**
 * Write a Java program to find the maximum and minimum value of an array.
 * */

public class ArrayTest10 {
    public static void main(String[] args) {
        int [] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int max=nums[0],min = nums[0];
        for (int i=0; i< nums.length;i++){

            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];

        }

        System.out.println("max = " +max + " min = " + min);
    }
}
