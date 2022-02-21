package com.live.coding.javas.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> cityNames = new ArrayList<String>();

        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Noida");

        // Iterator to iterate the cityNames
        Iterator iterator = cityNames.iterator();

        System.out.println("CityNames elements : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

}
}
