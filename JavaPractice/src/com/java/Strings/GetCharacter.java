package com.java.Strings;

import java.util.Scanner;

public class GetCharacter {

    static char getchar(String s, int in)
    {
        return s.charAt(in);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s = sc.nextLine();
        System.out.println("Enter the index you want to get: ");
        int in = sc.nextInt();

        char ch = getchar(s,in);
        System.out.println("Character is: " + ch);
    }
}
