package com.live.coding.javas.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamCountTest {
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

        long a = stringCollection
                .stream()
                .filter(t->t.startsWith("a"))
                .count();
        System.out.println(a);



    }
}
