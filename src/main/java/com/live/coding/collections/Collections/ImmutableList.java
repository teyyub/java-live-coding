package com.live.coding.collections.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        list.add("four");
        System.out.println(list);
        List<String> unmodifiableList = Collections.unmodifiableList(list);
//        unmodifiableList.add("five");

        list.add("six");
        System.out.println(list);
    }
}
