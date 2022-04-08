package com.live.coding.javas.collections.arrays.examples.ex12;

// TODO: 08.04.2022 https://yourbasic.org/algorithms/time-complexity-explained 
public class Test12 {
    public static void main(String[] args) {
//        int[] arr = {1,0,1, 2 , 3, 4, 5,2,13,5,4,7,8,5,16,7,7,9};
        int[] arr = {1,0,1,1};
        int length =arr.length;
        for(int i = 0;i< length;i++){

           for(int j=i+1;j<length;j++){

               if(arr[i]==arr[j]) {
                   System.out.println(arr[i]);
                  // break;
               }

           }

        }
//        System.out.println(Arrays.toString(arr));

    }
}
