package com.java.Random;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess_number = (int)(Math.random()*100);
        System.out.println("Input any number:");
        int user_number=0;
        do {
            user_number = sc.nextInt();
            if(user_number==guess_number)
            {
                System.out.println("Woww, You guessed the correct number!!");
                System.out.println("Your number was: " + user_number);
                break;
            }
            else if(user_number<guess_number)
            {
                System.out.println("Guessed number is too small.");
            }
            else System.out.println("Guessed number is too large.");
        }while(user_number>=0);

        System.out.println("THE END");
    }
}
