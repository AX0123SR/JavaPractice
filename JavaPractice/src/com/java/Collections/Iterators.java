package com.java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class Iterators {

    static void removeEven(Collection<Integer> c)
    {
       Iterator<Integer> it = c.iterator();
       while (it.hasNext())
       {
           int x = (Integer)it.next();
           if(x%2 == 0)
           {
               it.remove();
           }
       }
        System.out.println(c);
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(10);
        l.add(13);
        removeEven(l);
    }
}
