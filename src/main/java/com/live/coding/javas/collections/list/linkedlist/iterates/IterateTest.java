package com.live.coding.javas.collections.list.linkedlist.iterates;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateTest {
    public static void main(String[] args) {
        List<String> linkedlist = new LinkedList();

        // Add elements to LinkedList
        linkedlist.add("Delhi");
        linkedlist.add("Agra");
        linkedlist.add("Mysore");
        linkedlist.add("Chennai");
        linkedlist.add("Pune");

        // Obtaining Iterator
        Iterator it = linkedlist.iterator();

        // Iterating the list in forward direction
        System.out.println("LinkedList elements:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
