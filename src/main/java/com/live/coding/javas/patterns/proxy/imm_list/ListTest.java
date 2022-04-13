package com.live.coding.javas.patterns.proxy.imm_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    private String name;
    private List<String> names =  new ArrayList<>();


    public ListTest(String name) {
        this.name = name;
        this.names.add("bir");
        this.names.add("iki");
    }

    public List<String> getNames() {
        return new ArrayList(names);
    }

    public void print(){
        System.out.println(this.name +" " +this.names);
    }
}
