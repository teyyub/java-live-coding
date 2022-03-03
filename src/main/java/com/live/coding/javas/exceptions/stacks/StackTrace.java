package com.live.coding.javas.exceptions.stacks;

public class StackTrace {

    public static void main(String[] args) {
       try{
           a();
       } catch (Exception e) {
           System.err.println(e.getMessage());
       }
    }

    static void a() {
        b();
    }

    static void b() {
        c();
    }

    static void c() {
        d();
    }

    static void d() {
//        throw new NullPointerException("Oops!");
        Thread.dumpStack();
    }
}