package com.java.Class;

public class Multilevel_Inherit {
    void display()
    {
        System.out.println("I am from parent");
    }
}

class C1 extends Multilevel_Inherit
{
    void display()
    {
        System.out.println("I am from C1");
    }
}

class C2 extends Multilevel_Inherit
{
    void display()
    {
        System.out.println("I am from C2");
    }
}

class Multilevel
{
    public static void main(String[] args) {
        C1 c1 = new C1();
        C2 c2 = new C2();
        c1.display();
        c2.display();
        Multilevel_Inherit m = new C1();
        m.display();
    }
}