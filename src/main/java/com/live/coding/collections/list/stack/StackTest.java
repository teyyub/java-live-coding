package com.live.coding.collections.list.stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        // Create Integer type stack
        Stack<String> animals = new Stack();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
    }
}
