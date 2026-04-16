import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {56,62,17,89,34};
        System.out.print("Original Array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n-1; i++) {
        // Outer loop: i goes from 0 to n-1
        // At each step, arr[0..i-1] is sorted, arr[i..n-1] is unsorted
            int min_index = i;

            for (int j = i+1 ; j < n; j++) {
                if (arr[j]< arr[min_index]){
                    min_index = j; // update index of minimum element

                }
            }
            // Swap minimum element with arr[i]
            // This moves the smallest remaining element to its correct position
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    static void printArray(int[] arr){
        for (int val:arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
