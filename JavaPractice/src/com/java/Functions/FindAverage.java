package com.java.Functions;

import java.util.Scanner;

public class FindAverage {

    public static void average(int[] ar,int n)
    {
        int sum=0;
        float avg;
        for(int i=0; i<n; i++)
        {
            Scanner sc = new Scanner(System.in);
            ar[i] = sc.nextInt();
            sum = sum + ar[i];
        }
        avg = sum/n;
        System.out.println("Total : " + sum);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
                int[] ar = new int[10];
                Scanner sc = new Scanner(System.in);
                try
                {
                    System.out.println("Input number of elements you want to get the average: ");
                    int n = sc.nextInt();
                    average(ar,n);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid input, Please add valid integer");
                }
                finally {
                    sc.close();
                }

    }
}
