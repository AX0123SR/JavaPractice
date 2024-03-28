package com.java.Arrays;

import java.util.Scanner;

public class ArrayofNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] name = new String[size];
        System.out.println("Enter the names: ");
        for(int i=0; i<size; i++)
        {
            name[i] = sc.nextLine();
        }

        System.out.println("Entered names are: ");
        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]);
        }
    }
}
