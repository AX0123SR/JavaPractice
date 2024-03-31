package com.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(6);
        l.add("ayush");
        l.add(23.5);
        l.add(23.5);
        l.remove(2);
        System.out.println(l);
        System.out.println(l.contains("ayush"));
        System.out.println(l.get(2));
        System.out.println(l.set(3,"akash"));
        System.out.println(l.indexOf(2));
        System.out.println(l.lastIndexOf(23.5));
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        l.clear();
        System.out.println(l);
    }
}
