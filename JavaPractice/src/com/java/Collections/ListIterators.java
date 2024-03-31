package com.java.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(6);
        ListIterator<Integer> l1 = l.listIterator();
        while(l1.hasNext())
        {
            System.out.println(l1.next());
        }
    }

}
