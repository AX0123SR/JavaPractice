package com.java.Functions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void fibo(int n)
    {
        int a=0,b=1;
        int c=0;
        if(n<=0)
        {
            System.out.println("Number must be greater than zero");
        }
        else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Input terms upto : ");
            int n = sc.nextInt();
            fibo(n);
        }
        catch(Exception e)
        {
            System.out.println("Invalid values. Please enter only integers");
        }
        finally {
            sc.close();
        }


    }
}
