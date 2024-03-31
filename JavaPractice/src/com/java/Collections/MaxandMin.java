package com.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Enter the inputs for arrayList:");
        for(int i=0;i<6;i++) {
            l.add(sc.nextInt());
        }
        System.out.println("Maximum : " + maximumElement(l) + "\nMinimum : "  + minimumElement(l));
    }

    public static int maximumElement(ArrayList<Integer> arr)
    {
        int max = arr.get(0);
        for(int i = 1;i<arr.size();i++)
        {
            if(max < arr.get(i))
            {
                  max = arr.get(i);
            }
        }
        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr)
    {
        int min = arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(min > arr.get(i))
            {
                min = arr.get(i);
            }
        }
        return min;
    }


}
