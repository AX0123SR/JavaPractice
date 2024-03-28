package com.java.Random;

import java.time.LocalDate;
import java.util.Scanner;

public class FindDayOfAnyYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input date in the format 'day month year': ");
        String inputDate = sc.nextLine();
        //Storing the String into array and split each substring based on whitespaces
        String[] s = inputDate.split(" ");
        // Convert String into Integer
        int day = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int year = Integer.parseInt(s[2]);
        String res = findDay(day,month,year);
        System.out.println("The day of Week : " + res);
    }

    public static String findDay(int day,int month,int year)
    {
        LocalDate ld = LocalDate.of(year,month,day);
        return ld.getDayOfWeek().toString();
    }
}
