package com.java.Random;

public class CommandLineArguments {

    public static void main(String[] args) {
        int a,b,sum=0;
        try
        {
           a =  Integer.parseInt(args[0]);
           b = Integer.parseInt(args[1]);
           sum = a+b;
            System.out.println("Sum is: " + sum);
        }
        catch(Exception e)
        {
            System.out.println("Insufficient numbers");
            e.printStackTrace();
        }
    }
}
