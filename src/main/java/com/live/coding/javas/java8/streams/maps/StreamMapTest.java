package com.live.coding.javas.java8.streams.maps;

import java.util.ArrayList;
import java.util.List;

public class StreamMapTest {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .sorted((a, b) -> b.compareTo(a))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("after................................ ");
        stringCollection
                .stream()
                .forEach(System.out::println);

    }
}
