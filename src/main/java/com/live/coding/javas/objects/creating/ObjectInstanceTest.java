package com.live.coding.javas.objects.creating;

import java.util.Objects;

/**
 * https://techvidvan.com/tutorials/java-object-creation/
 * */
public class ObjectInstanceTest extends Object {
    private int age;
    private String name;

    public ObjectInstanceTest(int age, String name) {
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
        try {
            Class ob1 = Class.forName("com.live.coding.javas.objects.creating.ObjectInstanceTest");
            Class ob2 = Class.forName("com.live.coding.javas.objects.creating.ObjectInstanceTest");

            ObjectInstanceTest objectName = (ObjectInstanceTest) ob1.newInstance();
            System.out.println(objectName.name);
        } catch (Exception e){
            System.out.println("exception "+e);
        }
    }
}
