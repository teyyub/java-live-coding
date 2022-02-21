package com.live.coding.javas.collections.arrays.examples.ex8;

import java.util.Arrays;

/**
 * Write a Java program to copy an array by iterating the array
 * */
public class ArrayTest8 {
    public static void main(String[] args) {
        int [] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int [] copyArray = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            copyArray[i] = nums[i];
        }
        System.out.println(Arrays.toString(copyArray));
    }
}
