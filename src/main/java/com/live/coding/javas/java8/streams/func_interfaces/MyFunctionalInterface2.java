package com.live.coding.javas.java8.streams.func_interfaces;

import java.io.IOException;
import java.io.PrintWriter;

public interface MyFunctionalInterface2{
      void execute();

      default void print(String text) {
        System.out.println(text);
    }

      static void print(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }
}