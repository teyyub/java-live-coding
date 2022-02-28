package com.live.coding.javas.objects.casting;

public class CastingTes {
    public static void main(String[] args) {
        Parent p = new Child();

        System.out.println( p instanceof Parent);
        System.out.println( p instanceof Child);
        Child c = (Child) p;
        System.out.println("================");
        System.out.println( c instanceof Parent);
        System.out.println( c instanceof Child);
        System.out.println( p instanceof Parent);
        System.out.println( p instanceof Child);
        System.out.println("=================");
        System.out.println(p.age);
        System.out.println(">>>>>");
        System.out.println(c.age);
        System.out.println(c.name);

        ;
    }

}
