package com.live.coding.javas.patterns.proxy.imm_list;

// TODO: 13.04.2022 budurmu goresen ?
/**
 * https://www.baeldung.com/java-arrays-aslist-vs-new-arraylis
 *https://www.geeksforgeeks.org/immutable-list-in-java
 */
public class TestMain {
    public static void main(String[] args) {
        ListTest lt = new ListTest("Teyyub");
        lt.print();
        lt.getNames().add("uc");
        lt.print();

    }
}
