package com.java.Class;

public class Vehicle {

    void drive()
    {
        System.out.println("Repairing a vehicle");
    }
}

class Car extends Vehicle
{
    void drive()
    {
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
    }
}
