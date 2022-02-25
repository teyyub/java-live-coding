package com.live.coding.javas.objects.equals;

public class Cat {
    public static void main(String[] args) {
        Cat oldCat = new Cat();
        Cat newCat = new Cat();
        Cat oldCatRef = oldCat;


        System.out.println(oldCat==newCat);
        System.out.println(oldCat.equals(newCat));
        System.out.println(oldCat.hashCode());
        System.out.println(newCat.hashCode());
        System.out.println("=======================");

        System.out.println(oldCatRef==oldCat);
        System.out.println(oldCatRef.equals(oldCat));
        System.out.println(oldCatRef.hashCode());
        System.out.println(oldCat.hashCode());
        System.out.println("=======================");

        System.out.println(oldCat.hashCode());
        System.out.println(newCat.hashCode());
        System.out.println(oldCatRef.hashCode());

        System.out.println(oldCat.getClass().getName());
    }



}
