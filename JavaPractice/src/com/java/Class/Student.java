package com.java.Class;

public class Student {

  void display()
  {
      System.out.println("I am from parent class");
  }
}


class Child extends Student {

    @Override
    void display() {
        super.display();
        System.out.println("I am from child class");
    }
}

class Main
{
    public static void main(String[] args) {
//        Child c = new Child();
//        c.display();
        Student s = new Child();
        s.display();
//        c.display1();

    }
}


