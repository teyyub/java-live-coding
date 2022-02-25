package com.live.coding.javas.collections.list.linkedlist;

import java.util.List;

public class MyNode {
    private String value;
    private MyNode left;
    private MyNode right;

    public MyNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "value='" + value + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void main(String[] args) {
        MyNode myNode = new MyNode("root");
        System.out.println(myNode);
    }
}
