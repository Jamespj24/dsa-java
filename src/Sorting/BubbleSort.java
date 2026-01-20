package Sorting;

import java.util.Arrays;

public class BubbleSort {
    //Time Complexity: O(n^2) for nested loops in worst and average case.Best case: O(n) when the array is already sorted.
    //Space Complexity: O(1) as no extra space is used.
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped = false;
        for(int i = n - 1;i >=0;i--){
            for(int j = 0;j<= i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }


    }
}
