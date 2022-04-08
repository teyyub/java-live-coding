package com.live.coding.javas.java8.streams.reduces;

import java.util.Arrays;

public class StreamReduceTest1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println("sum : " + sum); // 55


        // TODO: 17.03.2022 with reduce
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1st argument, init value = 0
        int sum1 = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

        System.out.println("sum : " + sum); // 55


        int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum); // 55
    }
}
