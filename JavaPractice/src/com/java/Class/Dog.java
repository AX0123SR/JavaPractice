package com.java.Class;

public class Dog {
    String name;
    String breed;


//    Dog(String dname, String dbreed)
//    {
//        this.name = dname;
//        this.breed = dbreed;
//    }

    Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    void print()
    {
        System.out.println("Dog name: " + name + "\nDog Breed: " + breed);
    }

    void setName(String dname, String dbreed)
    {
        name = dname;
        breed = dbreed;
    }

    public static void main(String[] args) {
        Dog d  = new Dog("Rado","Pitbull");
        System.out.println("Before change: " + d.name + "," + d.breed);
        d.print();
        d.setName("Tom","Labrador");
        System.out.println("After change: " + d.name + "," + d.breed);
        d.print();
    }
}

