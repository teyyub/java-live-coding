package com.live.coding.javas.collections.list.arraylist;

import com.live.coding.memory.HeapMemory;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
            for(int i=0;i<1_000_000;i++){
                list.add("asdasdasdas");
                if(i % 100_000 == 0){
                    HeapMemory.print();
                    System.out.println("==========================");
                }

            }
            list = null;
            HeapMemory.print();
    }
}
