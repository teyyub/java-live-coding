package com.live.coding.javas.objects;

public class passByValue {
   static Person p1;
    static class  Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {
          p1  = new Person("teyyub");
        System.out.println(p1.name);
        test(p1);
        System.out.println(p1.name);
    }

    static void test(Person p){
        System.out.println(p1==p);
        p = new Person("kimse");
        p.name = "kimse";
        System.out.println(p1==p);
    }
}
