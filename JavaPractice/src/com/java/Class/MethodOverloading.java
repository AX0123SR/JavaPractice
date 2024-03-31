package com.java.Class;

public class MethodOverloading {

    static int print(int a,int b)
    {
        return a*b;
    }
}

class over extends MethodOverloading
{
    static int print(int a,int b,int c)
    {
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println(print(3,4));
        System.out.println(print(3,4,5));
    }
}


