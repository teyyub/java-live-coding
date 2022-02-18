package com.live.coding.collections.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        //Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: "+vec);


        Enumeration<String> listEnum = vec.elements();
        while (listEnum.hasMoreElements()) {
            String str = listEnum.nextElement();
            if (str.equals("ankit")) {
                // adding element will not throw any Exception
                vec.add("newEle");
            }
            System.out.println(str);
        }



        System.out.println("-------use iterator-------");
        // fail-fast
        Iterator<String> iterator = vec.iterator();
        while (iterator.hasNext()) {
            vec.add("newEle"); // unComment to avoid ConcurrentModificationException
            System.out.println(iterator.next());
        }



        System.out.println("-------use listIterator-------");
        // fail-fast
        ListIterator<String> listIterator = vec.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
            vec.add("newEle"); // unComment to avoid ConcurrentModificationException
            System.out.println(listIterator.next());
        }


        System.out.println("-------use enhanced for loop-------");
        //enhanced for loop is fail-fast
        for (String string : vec) {
            vec.add("newEle"); // unComment to avoid ConcurrentModificationException
            System.out.println(string);
        }


    }
}
