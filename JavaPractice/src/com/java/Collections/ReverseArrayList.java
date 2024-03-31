package com.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public static ArrayList<String> getReverse(ArrayList<String> s)
    {
        ArrayList<String> as = new ArrayList<>();
        for(int i=s.size()-1;i>=0;i--)
        {
            as.add(s.get(i));
        }
        return as;
    }

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Ayush");
        ar.add("Akash");
        ar.add("Ashish");
        List<String> l = getReverse(ar);
        System.out.println(l);
        }
    }

