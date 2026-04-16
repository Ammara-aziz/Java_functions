import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        getInput(sc, arr, n);

        System.out.print("Original array: ");
        printArray(arr);

        System.out.print("Sorted array: ");
        selectionSort(arr);
        printArray(arr);
    }

    static void getInput(Scanner sc, int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void selectionSort(int[] arr) {
        int x = arr.length;

        for (int i = 0; i < x - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < x; j++) {
                if (arr[j] < arr[min_index]) {   // compare values
                    min_index = j;
                }
            }

            // Swap arr[i] and arr[min_index]
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
