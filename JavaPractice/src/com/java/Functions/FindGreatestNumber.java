package com.java.Functions;

import java.util.Scanner;

public class FindGreatestNumber {

    public static void findgreatest(int n1,int n2)
    {
        if(n1<=0 || n2<=0)
        {
            System.out.println("Please enter positive values");
        }
        else if(n1 == n2) {
            System.out.println("Both numbers are equal");
        }
        else if(n1>n2)
        {
            System.out.printf("%d is greater than %d",n1,n2);
        }
        else
            System.out.printf("%d is greater than %d",n2,n1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Input two numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            findgreatest(n1,n2);
        }
        catch(Exception e)
        {
            System.out.println("Invalid input. Please enter valid integers.");
        }
        finally {
            sc.close();
        }

    }
}
