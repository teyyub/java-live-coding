package com.live.coding.interview_240;

public class StaticTest {

    public int age = 45;
    public static int id = 100;
    public StaticTest(){
        System.out.println("object created");
    }

    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        StaticTest.MyClass mc = new StaticTest.MyClass();
        mc.print();

        StaticTest.MyInnerClass mic =  new StaticTest() .new MyInnerClass();
        mic.print();

    }



    static class MyClass{
        public MyClass(){
            System.out.println("my class created " +id);
        }
        public void print(){
            System.out.println("salam");
        }
    }

     class MyInnerClass{
        public MyInnerClass(){
            System.out.println("my class created " +id);
            System.out.println("my class created " +age);

        }
        public void print(){
            System.out.println("salam");
        }
    }

}