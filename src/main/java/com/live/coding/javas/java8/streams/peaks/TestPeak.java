package com.live.coding.javas.java8.streams.peaks;

import java.util.Arrays;
import java.util.List;

public class TestPeak {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("A", "B", "C", "D");

        long count = l.stream().peek(System.out::println).count();

        System.out.println(count); // 4
    }
}
