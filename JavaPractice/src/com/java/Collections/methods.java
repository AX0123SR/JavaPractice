package com.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class methods
{
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        List<Integer> l2= new ArrayList<Integer>();
        l2.add(40);
        l2.add(20);
        l2.add(30);
        System.out.println(l1.containsAll(l2));
        l1.addAll(l2);
        System.out.println(l1);
        l1.removeAll(l2);
        System.out.println(l1);
        l1.retainAll(l2);
        System.out.println(l1);
        l2.removeIf(n->n<30);
        System.out.println(l2);


    }
}
