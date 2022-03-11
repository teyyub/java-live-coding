package com.live.coding.javas.collections.list.arraylist;

import com.live.coding.memory.HeapMemory;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add("teyyub");
        list.add("teymur");
        list.add("atilla");

        HeapMemory.print();


    }
}
