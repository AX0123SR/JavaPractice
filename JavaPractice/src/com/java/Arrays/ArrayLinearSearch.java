package com.java.Arrays;

public class ArrayLinearSearch {


    static int search(int arr[],int x)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,3,5,20,6,56,43};
        int x = 6;
        int result = search(arr,x);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Elements is found at index " + result);
    }


}
