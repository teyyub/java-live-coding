package com.live.coding.javas.collections.arrays.examples.CountFrequency.exp;

import java.util.HashMap;
import java.util.Map;

// TODO: 13.04.2022 Time Complexity : O(n)
public class Test1 {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> frequency = new HashMap<>();
//        for(int i =0 , len = str.length(); i<len; i++){
//            Integer exist = frequency.get(str.charAt(i));
//            if(exist==null)
//                    frequency.put(str.charAt(i),1);
//            else
//            frequency.put(str.charAt(i),++exist);
//        }
//
//        System.out.println(frequency);


        System.out.println("================================");



        frequency = new HashMap<>();
        for(int ii =0 , len1 = str.length(); ii<len1; ii++){
            if(frequency.containsKey(str.charAt(ii))){
                frequency.put(str.charAt(ii),frequency.get(str.charAt(ii))+1) ;
            } else {
                frequency.put(str.charAt(ii),1);
            }
        }

        System.out.println(frequency);

    }
}
