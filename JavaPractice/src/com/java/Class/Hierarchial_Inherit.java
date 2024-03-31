package com.java.Class;

public class Hierarchial_Inherit {

    void display()
    {
        System.out.println("I am from Parent class");
    }
}

class Child1 extends Hierarchial_Inherit
{
    void display1()
    {
        System.out.println("I am the Child1");
    }
}

class Child2 extends Hierarchial_Inherit
{
    void display2()
    {
        System.out.println("I am the Child2");
    }
}

class Child3 extends Hierarchial_Inherit
{
    void display3()
    {
        System.out.println("I am the Child3");
    }
}

class Hierarchy
{
    public static void main(String[] args) {
           Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        c1.display();
        c2.display();
        c3.display();
    }
}