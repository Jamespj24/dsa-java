package Sorting;

public class QuickSort {
    //Time Complexity: O(n log n) on average, O(n^2) in the worst case
    //Space Complexity: O(log n) due to recursive stack space
    //Unstable Sort
    public static void quickSort(int[] arr,int low,int high){
        if(low < high){ // Base case: array of size 1

            int partitionIndex = partition(arr,low,high); // Partitioning index

            quickSort(arr,low,partitionIndex - 1); // Recursively sort elements before partition

            quickSort(arr,partitionIndex + 1,high); // Recursively sort elements after partition
        }
    }
    // Partition function to place pivot element at correct position
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; // pivot
        int leftIndex = low; // Index of smaller element
        int rightIndex = high - 1; // Index of larger element

        // Rearranging elements based on pivot
        while(leftIndex <= rightIndex){
            while(leftIndex <= rightIndex && arr[leftIndex] < pivot){
                leftIndex++;
            }
            while(leftIndex <= rightIndex && arr[rightIndex] >= pivot){
                rightIndex--;
            }
            // Swap elements at leftIndex and rightIndex
            if(leftIndex < rightIndex){
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
            }
        }
        // Swap pivot element with element at leftIndex
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[high];
        arr[high] = temp;

        return leftIndex;
    }

}