package com.live.coding.javas.objects;

/**
 * https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/
 * https://www.baeldung.com/java-deep-copy
 */

public class CloneTest {
    public static void main(String[] args) {
        Test ob1 = new Test();
        System.out.println(ob1.x + " " + ob1.y);
        // Creating a new reference variable ob2
        // pointing to same address as ob1
        Test ob2 = ob1;

        // Any change made in ob2 will
        // be reflected in ob1
        ob2.x = 100;

        System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);
    }


    static class Test {
        int x, y;
        Test()
        {
            x = 10;
            y = 20;
        }
    }
    static class Test2 implements Cloneable {
        int a, b;

        Test c = new Test();

        public Object clone() throws CloneNotSupportedException
        {
            // Assign the shallow copy to
            // new reference variable t
            Test2 t = (Test2)super.clone();

            // Creating a deep copy for c
            t.c = new Test();
            t.c.x = c.x;
            t.c.y = c.y;

            // Create a new object for the field c
            // and assign it to shallow copy obtained,
            // to make it a deep copy
            return t;
        }
    }
}
