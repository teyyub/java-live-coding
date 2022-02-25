package com.live.coding.javas.objects.equals;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Person,String> maps = new HashMap<>();
        Person p1 = new Person("teyyub",32);
        Person p2 = new Person("teyyub" ,12);



        System.out.println("p1.hashcode " +p1.hashCode());
        System.out.println("p2.hashcode " +p2.hashCode());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("=====================");
        maps.put(p1,"duzdur");
        maps.put(p2,"sehvdir");
        System.out.println("======================");
        System.out.println(maps.get(p1));
        System.out.println(maps.get(p2));

        System.out.println("collusion");
        p2.setAge(32);
        System.out.println("=======================");
        System.out.println("p1.hashcode " +p1.hashCode());
        System.out.println("p2.hashcode " +p2.hashCode());
        System.out.println(maps.get(p1));
        System.out.println(maps.get(p2));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
