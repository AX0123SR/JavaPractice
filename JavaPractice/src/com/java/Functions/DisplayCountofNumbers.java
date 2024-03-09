package com.java.Functions;

import java.util.Scanner;

public class DisplayCountofNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for continue, 0 to exit");
        int input=sc.nextInt();

        int pos=0,neg=0,zero=0;
        while(input==1)
        {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number==0)
                zero +=1;
            if(number<0)
                neg+=1;
            if(number>0)
                pos+=1;
            System.out.println("Press 1 for continue, 0 to exit");
            input=sc.nextInt();
        }
        System.out.println("Total zeroes: " + zero);
        System.out.println("Total positives: " + pos);
        System.out.println("Total negatives: " + neg);

    }

}
