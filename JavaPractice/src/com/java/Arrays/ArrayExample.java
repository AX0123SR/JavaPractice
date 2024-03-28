package com.java.Arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
