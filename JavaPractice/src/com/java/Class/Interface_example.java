package com.java.Class;



interface I1
    {
        final int count=10;
        void display();
    }

 class Itest implements I1
 {
      public void display()
       {
           System.out.println("I am implementing");
       }

     public static void main(String[] args) {
         Itest t = new Itest();
         t.display();
         System.out.println(count);
     }
 }

