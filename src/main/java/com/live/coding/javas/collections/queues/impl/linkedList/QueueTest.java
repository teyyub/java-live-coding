package com.live.coding.javas.collections.queues.impl.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("teyyub");
        q.add("teymur");
        q.add("atilla");
//        q.add("Negan");
//        q.add("Daryl");


        System.out.println("Elements in Queue:"+q);


        /*
         * We can remove element from Queue using remove() method,
         * this would remove the first element from the Queue
         */
        System.out.println("Removed element: "+q.remove());

        /*
         * element() method - this returns the head of the
         * Queue. Head is the first element of Queue
         */
        System.out.println("Head: "+q.element());

        /*
         * poll() method - this removes and returns the
         * head of the Queue. Returns null if the Queue is empty
         */
        System.out.println("poll(): "+q.poll());

        /*
         * peek() method - it works same as element() method,
         * however it returns null if the Queue is empty
         */
        System.out.println("peek(): "+q.peek());

        //Again displaying the elements of Queue
        System.out.println("Elements in Queue:"+q);

    }
}
