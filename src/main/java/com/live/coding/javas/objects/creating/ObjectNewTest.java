package com.live.coding.javas.objects.creating;

import java.util.Objects;

/**
 * https://techvidvan.com/tutorials/java-object-creation/
 * */
public class ObjectNewTest extends Object {
    private int age;
    private String name;

    public ObjectNewTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ObjectTest that = (ObjectTest) o;
//        return age == that.age && Objects.equals(name, that.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "WaysTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ObjectNewTest ob1 = new ObjectNewTest(32,"teyyub");
        ObjectNewTest ob2 = new ObjectNewTest(32,"teyyub");
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1.equals(ob2));
        System.out.println("reference eyni olanda equal olur");
        Object ob3 = ob2;
        System.out.println(ob3.equals(ob2));

    }
}
