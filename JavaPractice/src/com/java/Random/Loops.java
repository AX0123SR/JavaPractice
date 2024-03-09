package com.java.Random;

import java.util.Scanner;

public class Loops {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to see the table: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d x %d = %d",num,i,num*i);
            System.out.println("");
        }
    }
}
