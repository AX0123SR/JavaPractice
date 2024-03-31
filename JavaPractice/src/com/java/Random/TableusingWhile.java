package com.java.Random;

import java.util.Scanner;

public class TableusingWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int mul =10;
        while(mul>=0)
        {
            System.out.print(mul*n + " ");
            mul--;
        }
    }
}
