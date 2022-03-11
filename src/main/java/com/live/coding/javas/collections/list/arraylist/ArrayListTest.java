package com.live.coding.javas.collections.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    static ArrayList<String> list=new ArrayList(2);//Creating arraylist
    public static void main(String[] args) throws Exception{
        System.out.println(list.size());
        calculate();

        print("Mango");//Adding object in arraylist
//        print("Apple");
//        print("Banana");
//        print("Grapes");
//        print("Mango");//Adding object in arraylist
//        print("Apple");
//        print("Banana");
//        print("Grapes");
//        print("Mango");//Adding object in arraylist
//        print("Apple");
//        print("Banana");
//        print("Grapes");
//        print("Grapes");
//        print("Grapes");
//        print("Grapes");
//        print("Grapes");
//        print("Grapes");

    }

    static void print(String param) throws Exception {
        list.add(param);
        calculate();
    }
    static void calculate() throws Exception{
        Field privateField = ArrayList.class.getDeclaredField("DEFAULT_CAPACITY");
        privateField.setAccessible(true);

        Field privateField1 = ArrayList.class.getDeclaredField("elementData");
        privateField1.setAccessible(true);

        Field privateField2 = ArrayList.class.getDeclaredField("size");
        privateField2.setAccessible(true);

        int value = (Integer)privateField.get(list);

        Object [] objArry = (Object[]) privateField1.get(list);

        int size = (Integer) privateField2.get(list);

        System.out.println("elementData size "+objArry.length);

        //Printing the arraylist object
        System.out.println("list size "+list.size());
        System.out.println("size " + size);
        System.out.println("default capacity "+value);
        System.out.println("==================================");
    }
}
