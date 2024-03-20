package com.java.Class;

public class Constructor {

    int a,b;
    Constructor(int x,int y)
    {
        a=x;
        b=y;
    }

    void print()
    {
        System.out.println("a: " + a + " b: " +b);
    }
}

class Test
{
    public static void main(String[] args) {
        Constructor c = new Constructor(10,20);
        c.print();
    }
}
