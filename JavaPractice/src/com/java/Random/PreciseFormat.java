package com.java.Random;

import java.util.Scanner;

public class PreciseFormat {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first float number: ");
            float num1 = Float.parseFloat(scanner.nextLine());

            System.out.println("Enter the second float number: ");
            float num2 = Float.parseFloat(scanner.nextLine());

            float result = divide(num1, num2);
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter float numbers only.");
        }
        scanner.close();
    }

    public static float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

}
