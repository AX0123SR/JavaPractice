package com.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfSmallerElements {

    static List<Integer> getSmallerList(int[] arr,int k)
    {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<k)
            {
                li.add(arr[i]);
            }
        }
        return li;

    }
    public static void main(String[] args) {
        int[] ar = {10,34,40,12,45,42};
        List<Integer> l = getSmallerList(ar,30);
        for(Integer x:l)
        {
            System.out.println(x);
        }
    }
}
