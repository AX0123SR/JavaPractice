package com.java.Random;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertIntegerToString {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number you want to convert to String: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);

        //2nd way of conversion
        if(n==Integer.parseInt(s))
        {
            //1st way of conversion
//            if (s instanceof String) {
                System.out.println("Good Job");
            }
        } catch(Exception e)
        {
            System.out.println("Invalid Conversion");
        }
    }
}
