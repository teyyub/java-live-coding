package com.live.coding.javas.collections.list.stack;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackTest {
    static Stack<String> animals = new Stack();
    public static void main(String[] args) {
        // Create Integer type stack

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println(animals.get(0));

        Iterator value = animals.iterator();

        // Displaying the values
        // after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
    }
}
