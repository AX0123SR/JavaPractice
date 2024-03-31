package com.java.Functions;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2; i<n; i++)
        {
            if(n%i == 0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n  = sc.nextInt();
       boolean res = isPrime(n);
        if(res == false)
        {
            System.out.println("Number is not prime");
        }
        else
            System.out.println("Number is prime");
    }
}
