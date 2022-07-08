package com.live.coding.javas.collections.arrays.examples.CountFrequency.exp;

import java.util.*;

//https://www.knowprogram.com/java/count-repeated-elements-in-array-java/
// TODO: 13.04.2022 Time Complexity : O(n)
public class Test2 {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> frequency =  new LinkedHashMap<>();
        for(int i =0 , len = str.length(); i<len; i++){
            Integer exist = frequency.get(str.charAt(i));
            if(exist==null)
                    frequency.put(str.charAt(i),1);
            else
            frequency.put(str.charAt(i),++exist);
        }
        for (Map.Entry entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(frequency);
    }
}
