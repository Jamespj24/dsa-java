package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr,int low,int mid, int high){
        int[] temp = new int[high - low + 1]; // Temporary array to hold merged elements
        int left = low; // Starting index for left subarray
        int right = mid + 1; // Starting index for right subarray
        int k = 0; // Starting index for temporary array

        // Merge the two subarrays into temp[]
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            }
        }
        // Copy remaining elements of left subarray, if any
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while (right <= high){
            temp[k++] = arr[right++];
        }
        // Copy the merged elements back into original array
        for(int i = 0; i < temp.length; i++){
            arr[low + i] = temp[i]; // Copy back to original array
        }
    }
    // Recursive merge sort function
    //Time Complexity: O(n log n)
    //Space Complexity: O(n)
    //Stable Sort
    public static void mergeSort(int[] arr,int low , int high){
        if(low >= high){ // Base case: array of size 1
            return;
        }
        int mid = low + (high - low) / 2; // Find the mid point to divide the array into two halves

        mergeSort(arr,low,mid); // Sort the first half

        mergeSort(arr,mid+1,high); // Sort the second half

        merge(arr,low,mid,high); // Merge the sorted halves
    }
}
