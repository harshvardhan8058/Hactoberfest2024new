public class BubbleSort {
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Loop for each element in the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Flag to check if a swap was made

            // Last i elements are already sorted, no need to check them
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Set flag to true if swap happened
                }
            }

            // If no swaps were made, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the sorting algorithm
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
