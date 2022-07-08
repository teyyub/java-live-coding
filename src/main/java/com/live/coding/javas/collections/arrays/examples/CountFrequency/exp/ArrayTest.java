package com.live.coding.javas.collections.arrays.examples.CountFrequency.exp;

// TODO: 13.04.2022

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Time Complexity : O(n2)
 input ('programming') -> p-0, r-2, o-0 , g-2 tekrarlanan simvollarin sayi
 * */


public class ArrayTest {
    public static void main(String[] args) {
        String str = "programming";
        boolean[] visited = new boolean[str.length()];
        Arrays.fill(visited,false);
        int counter =1;
        for(int i=0, len =str.length(); i<len;i++) {

            if (visited[i] == true) continue;

            for (int j = 1 + i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                    visited[j] = true;
                }

            }
            System.out.println(str.charAt(i) +"->" + counter);
            counter=1;
        }
    }


}
