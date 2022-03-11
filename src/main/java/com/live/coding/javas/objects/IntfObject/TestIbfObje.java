package com.live.coding.javas.objects.IntfObject;

public class TestIbfObje {
    public static void main(String[] args) {
        A a = null;

        a.equals(null);

        a.hashCode();

        a.toString();

    }


    interface A
    {
        @Override
          boolean equals(Object obj);

        @Override
          int hashCode();

        @Override
          String toString();
    }

}
