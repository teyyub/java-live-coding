package com.live.coding.javas.java8.streams.maps;

import java.util.Arrays;
import java.util.List;

public class MapTest1 {
    static List<Integer> ints = Arrays.asList(1,2,3,4,5);
    public static void main(String[] args) {
        long a = ints.stream().map(integer -> 1+1).count();
        System.out.println(a);
    }
}
