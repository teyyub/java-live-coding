package com.live.coding.javas.objects.abstratcs;

public abstract class Test {
    private int age =10;
    private static int age1 =10;
    public Test(){
        age =100;
    }
    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Test.age1);
//        Test t = new Test();

    }
}
