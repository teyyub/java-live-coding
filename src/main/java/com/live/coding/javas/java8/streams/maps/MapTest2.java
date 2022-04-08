package com.live.coding.javas.java8.streams.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest2 {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        System.out.println("===========================");

        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(alpha); //[a, b, c, d]
        System.out.println(collect); //[A, B, C, D]

        System.out.println("=========================");

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        int a = num.stream().mapToInt(n -> n * 2).sum();
        System.out.println(a);
        System.out.println("===========================");
        System.out.println(num.stream().map(n -> n * 2));
        System.out.println("===========================");
        System.out.println(num.stream().mapToInt(n -> n * 2));

        System.out.println(collect1); //[2, 4, 6, 8, 10]
        System.out.println(num);

    }
}
