//To perform Binary search, the array must be sorted either in ascending/descending order.

package com.java.Arrays;

public class ArrayBinarySearch {

    public static int searchBinary(int arr[], int target)
    {
        int low = 0,mid;
        int high = arr.length-1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,23,34,56,67,78};
        int target = 34;
        int result = searchBinary(arr,target);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}
