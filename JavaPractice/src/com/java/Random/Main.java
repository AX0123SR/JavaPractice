package com.java.Random;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] marks = {{87,85,98},{56,78,74}};
        System.out.println(marks[0][2]);
        System.out.println(marks.length);

        String name = "Ayush Srivastava";
        System.out.println(name.length());
        String name1 = name.replace('a','f');
        System.out.println(name1);
        System.out.println(name.substring(1,5));

        //Print any random numbers
        for(int i=0; i<4; i++)
        {
            System.out.println((int)(Math.random()*100));
        }


    }
}
