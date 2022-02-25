package com.live.coding.javas.objects.equals;

/**
 * https://www.journaldev.com/21095/java-equals-hashcode
 * */

public class Person {
    private String name;
    private int age;
    private Integer a = new Integer("7");

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person("teyyub1",35);
        Person p1 = new Person("teyyub",35);
        Person p2 = p1;
        Person p3 =null;
        Person p4=p3;
        System.out.println(p1==p);
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p1.equals(p));
        System.out.println("=========================");
        System.out.println(p2==p1);
        System.out.println(p2.equals(p1));
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode());
        System.out.println("=========================");


    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age==person.age;
//    }
//
    @Override
    public int hashCode() {
        int hash = 7;
//        hash = 31 * hash + this.age;
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
