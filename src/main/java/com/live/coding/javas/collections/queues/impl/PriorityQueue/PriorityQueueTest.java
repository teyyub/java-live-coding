package com.live.coding.javas.collections.queues.impl.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    static Queue<Integer> numbers = new PriorityQueue<>();
    public static void main(String[] args) {
        numbers.add(4);
        numbers.add(2);
        numbers.add(0);
        numbers.add(12);
        numbers.add(-1);
        System.out.println("PriorityQueue: " + numbers);

    }
}
