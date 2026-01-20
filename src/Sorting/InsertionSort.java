package Sorting;

import java.util.Arrays;

public class InsertionSort {
    //Time Complexity: O(n^2) for nested loops in worst and average case.Best case: O(n) when the array is already sorted.
    //Space Complexity: O(1) as no extra space is used.
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i < n; i ++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
