package com.java.Class;

import java.util.Scanner;

public class AreaOfRectangle {

    int l,b;

    AreaOfRectangle(int length, int breadth)
    {
        l = length;
        b = breadth;
    }

    void getArea()
    {
        System.out.println("Area of rectangle: " + l*b);
    }

    public static void main(String[] args) {
        int l1,b1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        l1 = sc.nextInt();
        System.out.println("Enter breadth: ");
        b1 = sc.nextInt();
       AreaOfRectangle a = new AreaOfRectangle(l1,b1) ;
       a.getArea();

    }
}
