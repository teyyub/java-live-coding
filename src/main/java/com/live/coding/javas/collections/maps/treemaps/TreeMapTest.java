package com.live.coding.javas.collections.maps.treemaps;

import java.util.Map;
import java.util.TreeMap;
/**
 * https://www.dineshonjava.com/internal-working-of-treemap-in-java/
 * https://medium.com/xebia-engineering/treemap-internals-199e0e0050b5
 * https://javahungry.blogspot.com/2014/06/how-treemap-works-ten-treemap-java-interview-questions.html
 * https://www.java67.com/2012/08/difference-between-treemap-and-treeset-java.html
 * */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
