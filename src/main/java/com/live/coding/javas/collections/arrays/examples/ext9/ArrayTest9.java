package com.live.coding.javas.collections.arrays.examples.ext9;

import java.util.Arrays;

/**
 * Write a Java program to insert an element (specific position) into an array
 * */
public class ArrayTest9 {
    public static void main(String[] args) {
        int [] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int [] copyArray = new int[nums.length];
        int index = 2;
        int element =56;
        if(index <0 || index > nums.length+1) return;


        for(int i = 0; i< nums.length;i++){
            if(index == i) {
//                copyArray[i] = element;
                continue;
            }
            else {
                copyArray[i] = nums[i];
            }

        }

        System.out.println(Arrays.toString(copyArray));

    }
}
