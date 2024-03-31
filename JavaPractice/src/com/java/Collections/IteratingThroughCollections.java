package com.java.Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratingThroughCollections {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10,4,3,56);
        // Using ForEach loop
        for(Integer i:l1)
        {
            System.out.println(i);
        }

        System.out.println(" ");
        //Using ForEach method
        l1.forEach(System.out::println);

        //Using stream
        l1.stream().forEach(x-> System.out.print(x + " "));
    }
}
