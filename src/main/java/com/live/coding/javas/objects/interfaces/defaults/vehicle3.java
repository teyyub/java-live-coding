package com.live.coding.javas.objects.interfaces.defaults;

public interface vehicle3 extends vehicle2 ,vehicle1, vehicle {

    default void print() {
        System.out.println("I am a vehicle 3!");
    }

    default void print1() {
        System.out.println("I am a vehicle 3!");
    }

    default  void print2() {
        System.out.println("I am a vehicle 3!");
    }

    static void print3() {
        System.out.println("I am a vehicle 3!");
    }
}