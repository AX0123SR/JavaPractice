package com.java.Functions;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void findsumofoddnumbers(int maxnumber)
    {
        int sum=0;
        int n = maxnumber;
        if(maxnumber < 1)
            System.out.println("Number must be greater than 1");
        else
        {
            for(int i=1; i<=maxnumber; i++)
            {
                if(i%2!=0)
                {
                    sum = sum+i;
                }
                else
                    continue;
            }
            System.out.printf("Total sum from 1 to %d : %d ",n,sum);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Input the range: ");
            int maxnumber = sc.nextInt();
            findsumofoddnumbers(maxnumber);
        }
        catch(Exception e)
        {
            System.out.println("Invalid input. Please enter valid integer.");
        }
        finally {
            sc.close();
        }
    }
}
