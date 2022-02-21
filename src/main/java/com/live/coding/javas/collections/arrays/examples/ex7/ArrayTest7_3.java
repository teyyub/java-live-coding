package com.live.coding.javas.collections.arrays.examples.ex7;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Write a Java program to remove a specific element from an array.
 * */
public class ArrayTest7_3 {
    public static void main(String[] args) {
        int [] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
//        int [] copyArray = new int[nums.length-1];
        int index = 5;

//        // TODO: 21.02.2022 asagidaki kimi yox!!! continue istifade ede bilerik
//        for(int i=0,k=0;i< nums.length;i++){
//            if(i==index) continue;
//            copyArray[k++] = nums[i];
//        }
        
//        for(int i=0;i<index;i++){
//            copyArray[i] = nums[i];
//        }
//        for(int i= index+1; i< nums.length ; i++){
//           copyArray[i-1] = nums[i];
//        }
        System.out.println("Original array "+Arrays.toString(nums));
        System.out.println("Removing index " +index);
        nums = removeElement(nums,index);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] removeElement(int[] arr , int index){
        // TODO: 21.02.2022 asagidaki kimi yox!!! continue istifade ede bilerik
        if(arr==null || index<0 || index >=arr.length)
            return arr;

        int [] copyArray = new int[arr.length-1];

        System.arraycopy(arr, 0, copyArray, 0, index);

        System.arraycopy(arr, index+1, copyArray, index, arr.length-index-1);

        return copyArray;
    }


}
