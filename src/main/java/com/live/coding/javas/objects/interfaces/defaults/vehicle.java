package com.live.coding.javas.objects.interfaces.defaults;

public interface vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }

    default void print1() {
        System.out.println("I am a vehicle!");
    }

    default  void print2() {
        System.out.println("I am a vehicle!");
    }

    static void print3() {
        System.out.println("I am a vehicle!");
    }
}