package com.live.coding.javas.collections.arrays;

import java.util.Arrays;

/**
 *https://plumbr.io/outofmemoryerror/requested-array-size-exceeds-vm-limit
 */

public class ArrayTest {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        int[] arry = new int[214748364];
        System.out.println(arry.length);
    }
}
