package com.java.Functions;

import java.util.Scanner;

public class FindExponent {

    public static void power(int base,int exp) {
        int result = 1;
        if (base < 0 || exp < 0) {
            System.out.println("Numbers must be greater than or atleast equal to 0");
        } else {
            for (int i = 0; i < exp; i++) {
                result = result * base;
            }
            System.out.printf("%d is raised to power of %d: %d", base, exp, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter base: ");
            int base = sc.nextInt();
            System.out.println("Enter exponent: ");
            int exp = sc.nextInt();
            power(base,exp);
        }
       catch (Exception e)
       {
           System.out.println("Invalid Input. Please enter valid integers.");
       }
        finally {
            sc.close();
        }
    }
}
