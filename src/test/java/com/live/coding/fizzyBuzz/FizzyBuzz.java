package com.live.coding.fizzyBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Say Fizz if the number is divisible by 3.
 * Say Buzz if the number is divisible by 5.
 * Say FizzBuzz if the number is divisible by both 3 and 5.
 * Return the number itself, if the number is not divisible by 3 and 5.
 * */

/**
 * https://blog.eviltester.com/2018/03/acceptance-testing-fizzbuzz-java-junit.html
 * https://blog.eviltester.com/2018/03/acceptance-testing-fizzbuzz-java-junit.html
 * */
public class FizzyBuzz {
    static List<String> fizzBuzz = new ArrayList<String>();
    public static void main(String[] args) {
        checkNumber(20);
        System.out.println(fizzBuzz);
    }

    private static void checkNumber(int number) {
        for (int i = 1 ; i<=number ; i++){
            if(i % 15 == 0){
              fizzBuzz.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                fizzBuzz.add("Fizz");
            }
            else if(i % 5 == 0) {
                fizzBuzz.add("Buzz");
            }  else {
                fizzBuzz.add(String.valueOf(i));
            }

        }

    }
}
