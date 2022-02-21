package com.live.coding.javas.collections.arrays.examples;

/**
 * Write a Java program to find all triplets equal to a given sum in a unsorted array of integers
 * Example:
 * Input :
 * nums = { 1, 6, 3, 0, 8, 4, 1, 7 }
 * Output:
 * Triplets of sum 7
 * (0 1 6)
 * (0 3 4)
 * */
public class ArrayTest74 {
    public static void main(String[] args) {
        int [] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int sum =0;
        for(int i=0;i<nums.length;i++){

            sum += nums[i];

        }
        System.out.println(sum);
    }
}
