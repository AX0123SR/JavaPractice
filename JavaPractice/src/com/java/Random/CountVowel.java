package com.java.Random;

import java.util.Scanner;

public class CountVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v=0,c=0;
        System.out.println("Enter any string: ");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                v++;
            }
            else {
                c++;
            }

        }

        System.out.println("Total vowel count: " + v);
        System.out.println("Total consonants count: " + c);
    }
}
