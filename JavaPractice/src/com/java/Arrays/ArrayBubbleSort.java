package com.java.Arrays;

public class ArrayBubbleSort {


    static void printArray(int arr[])
    {
        for(int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr ={2,34,12,43,4,56,46};
        System.out.println("Arrays before sorted:");
        printArray(arr);
        System.out.println("Arrays after sorted:");
        bubbleSort(arr);
        printArray(arr);
    }
}
