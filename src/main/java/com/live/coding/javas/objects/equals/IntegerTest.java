package com.live.coding.javas.objects.equals;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = new Integer("100");
        Integer i2 = new Integer("100");
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i1.equals(i2));
        System.out.println(i1==i2);
        System.out.println("===================");
        // TODO: 23.02.2022 127 den boyuk olsa ferqli olacaq
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3.hashCode());
        System.out.println(i4.hashCode());
        System.out.println(i3.equals(i4));
        System.out.println(i3==i4);

        Integer.valueOf(200);


    }
}
