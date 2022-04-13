package com.live.coding.javas.collections.arrays.examples.ex12;

import java.util.HashMap;
import java.util.Map;

// TODO: 08.04.2022 https://yourbasic.org/algorithms/time-complexity-explained
public class Test12 {
    public static void main(String[] args) {
//        int[] arr = {1,0,1, 2 , 3, 4, 5,2,13,5,4,7,8,5,16,7,7,9};
        int[] arr = {1,0,1,1,0};
        Map<Integer, Integer> duplicated = new HashMap();
        int length =arr.length;
//        for(int i = 0;i< length;i++){
//           for(int j=i+1;j<length;j++){
//
//               if(arr[i]==arr[j]) {
//                   System.out.println(arr[i]);
//                  // break;
//               }
//           }
//        }
        int count=0;
        for(int i = 0;i< length;i++){
             if(duplicated.containsKey(arr[i])){
                 count++;
                 duplicated.put(arr[i], count);

             } else {
                 duplicated.put(arr[i], 1);
                 count=1;
             }

        }
        System.out.println(duplicated);

    }
}
