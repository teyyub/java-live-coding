package com.live.coding.javas.patterns.proxy.ex1;

// TODO: 13.04.2022 https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm 
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}